package hr.algebra.quoridor.server;

import hr.algebra.quoridor.model.GameState;
import hr.algebra.quoridor.model.PlayerMetadata;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    public static final String HOST = "localhost";
    public static final int PORT = 2002;
    private static final Map<Long, PlayerMetadata> players = new HashMap<>();

    public static void main(String[] args) {
        acceptRequests();
    }

    private static void acceptRequests() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            System.err.println("Server listening on port: " + serverSocket.getLocalPort());

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.err.println("Client connected from port: " + clientSocket.getPort());
                new Thread(() ->  processSerializableClient(clientSocket)).start();
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countVowels(String message) {
        return message.toLowerCase().replaceAll("[^aeiou]", "").length();
    }

    private static void processSerializableClient(Socket clientSocket) {
        try (ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
             ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream())) {

            PlayerMetadata playerMetadata = (PlayerMetadata) ois.readObject();

            System.out.println("Connected player metadata: " +
                    playerMetadata.getPlayerName() + " " +
                    playerMetadata.getIpAddress() + " " +
                    playerMetadata.getPort() + " " +
                    playerMetadata.getPid());

            if(players.size() < 2) {
                System.out.println("Adding a new player to the game.");
                players.put(playerMetadata.getPid(), playerMetadata);
                //oos.writeObject(1);
            }
            else {
                //oos.writeObject(0);
            }

            if (players.size() == 2) {
                //oos.writeObject(1);

                Long firstPlayerPid = players.keySet().stream().filter(pid -> !pid.equals(playerMetadata.getPid())).findFirst().get();
                PlayerMetadata firstPlayerMetadata = players.get(firstPlayerPid);

                try (Socket firstClientSocket = new Socket(firstPlayerMetadata.getIpAddress(), Integer.parseInt(firstPlayerMetadata.getPort()))) {
                    ObjectOutputStream oosFirstClient = new ObjectOutputStream(firstClientSocket.getOutputStream());
                    ObjectInputStream oisFirstClient = new ObjectInputStream(firstClientSocket.getInputStream());

                    System.err.println("Client is connecting to " + firstClientSocket.getInetAddress() + ":" + firstClientSocket.getPort());

                    oos.writeObject(1);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Server is trying to open a connection to the client...");

        while (true) {
            try (Socket serverClientSocket = new Socket(Server.HOST, 1986)) {
                System.out.println("Trying to open output stream to the client...");

                ObjectOutputStream oos = new ObjectOutputStream(serverClientSocket.getOutputStream());

                System.out.println("Connection to the client successfully created.");

                System.out.println("Sending a new GameState object to the client.");

                oos.writeObject(new GameState());

                System.out.println("New GameState object successfully sent to the client.");

                Thread.sleep(2000);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
