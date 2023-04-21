package hr.algebra.quoridor;

import hr.algebra.quoridor.model.GameState;
import hr.algebra.quoridor.model.Player;
import hr.algebra.quoridor.model.PlayerMetadata;
import hr.algebra.quoridor.server.Server;
import hr.algebra.quoridor.thread.ClientThread;
import hr.algebra.quoridor.util.AlertUtils;
import hr.algebra.quoridor.util.FXMLUtils;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static javafx.scene.control.Alert.AlertType.ERROR;

public class LogInScreenController {
    @FXML
    private TextField player_name_input;
    /*@FXML
    private TextField player_two_name_input;*/

    private static Player player;
    //private static Player playerTwo;

    public static Player getPlayer() {
        return player;
    }

    /*public static Player getPlayerTwo() {
        return playerTwo;
    }*/

    private static final Map<Long, PlayerMetadata> playersMetadata = new HashMap<>();

    public static Map<Long, PlayerMetadata> getPlayersMetadata() {
        return playersMetadata;
    }

    public void startGame() throws IOException {
        System.out.println("Client thread is about to start...");

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new ClientThread(new GameState()));

        System.out.println("Client thread started.");

        try (Socket clientSocket = new Socket(Server.HOST, Server.PORT)) {
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());

            System.err.println("Client is connecting to " + clientSocket.getInetAddress() + ":" +clientSocket.getPort());

            PlayerMetadata newPlayerMetadata = new PlayerMetadata(clientSocket.getLocalAddress().toString().substring(1),
                    String.valueOf(clientSocket.getPort()), player_name_input.getText(),
                    ProcessHandle.current().pid());
            playersMetadata.put(ProcessHandle.current().pid(), newPlayerMetadata);
            oos.writeObject(newPlayerMetadata);

            /*
            if (ois.available() > 0) {
                newPlayerMetadata.setPort(String.valueOf(clientSocket.getLocalPort()));
                System.out.println("Confirmation read from the server.");

                /*if (port == 0) {
                    System.exit(1);
                }
                else {
                    System.out.println("SUCCESSFULY CONNECTED");
                }
            }
            */

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (player_name_input.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Blank player name",
                    null,
                    "Player one name is blank!");

            return;
        }

        /*if (player_one_name_input.getText().isBlank() && player_two_name_input.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Blank player names",
                    null,
                    "Player names are blank!");

            return;
        }
        else if (player_one_name_input.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Blank player name",
                    null,
                    "Player one name is blank!");

            return;
        }
        else if (player_two_name_input.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Blank player name",
                    null,
                    "Player two name is blank!");

            return;
        }*/

        String playerOneName = player_name_input.getText();
        //String playerTwoName = player_two_name_input.getText();

        player = new Player(playerOneName);
        //playerTwo = new Player(playerTwoName);

        FXMLUtils.showScreen(
                "gameScreen.fxml",
                QuoridorApplication.getMainStage(),
                1050,
                690);
    }
}
