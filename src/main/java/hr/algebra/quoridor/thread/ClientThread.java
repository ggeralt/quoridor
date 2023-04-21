package hr.algebra.quoridor.thread;

import hr.algebra.quoridor.model.GameState;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientThread implements Runnable {
    private GameState gameState;

    public ClientThread(GameState gameState) {
        this.gameState = gameState;
    }

    @Override
    public void run() {
        System.out.println("Client thread started.");

        try (ServerSocket serverSocket = new ServerSocket(1986)) {
            System.out.println("Client server socket opened.");

            while (true) {
                System.out.println("Waiting for requests from server...");

                Socket clientSocket = serverSocket.accept();

                System.out.println("Request from server accepted.");

                try (ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream())) {
                    this.gameState = (GameState) ois.readObject();

                    System.out.println("New game state received from server.");
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
