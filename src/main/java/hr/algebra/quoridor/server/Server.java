package hr.algebra.quoridor.server;

import hr.algebra.quoridor.model.PlayerMetadata;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    public static final String HOST = "localhost";
    public static final int PORT = 1995;
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
             ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream())){

            PlayerMetadata playerMetadata = (PlayerMetadata) ois.readObject();

            System.out.println("Connected player metadata: " +
                    playerMetadata.getPlayerName() + " " +
                    playerMetadata.getIpAddress() + " " +
                    playerMetadata.getPort() + " " +
                    playerMetadata.getPid());

            if(players.size() < 2) {
                players.put(playerMetadata.getPid(), playerMetadata);
            }
            else {
                oos.writeObject(0);
            }

            if (players.size() == 2) {
                oos.writeObject(1);

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
    }
}
