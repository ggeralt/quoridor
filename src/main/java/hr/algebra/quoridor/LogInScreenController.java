package hr.algebra.quoridor;

import hr.algebra.quoridor.model.Player;
import hr.algebra.quoridor.model.PlayerMetadata;
import hr.algebra.quoridor.server.Server;
import hr.algebra.quoridor.util.AlertUtils;
import hr.algebra.quoridor.util.FXMLUtils;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import static javafx.scene.control.Alert.AlertType.ERROR;

public class LogInScreenController {
    @FXML
    private TextField player_name_input;

    private static Player player;

    public static Player getPlayer() {
        return player;
    }

    public void startGame() throws IOException {
        try (Socket clientSocket = new Socket(Server.HOST, Server.PORT)) {
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());

            System.err.println("Client is connecting to " + clientSocket.getInetAddress() + ":" +clientSocket.getPort());

            oos.writeObject(new PlayerMetadata(clientSocket.getLocalAddress().toString().substring(1),
                    String.valueOf(clientSocket.getPort()), player_name_input.getText(),
                    ProcessHandle.current().pid()));

            if (ois.available() > 0) {
                int confirmation = (int) ois.readObject();

                if (confirmation == 0) {
                    System.exit(1);
                }
                else {
                    System.out.println("SUCCESSFULY CONNECTED");
                }
            }

        } catch (IOException | ClassNotFoundException e) {
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

        String playerOneName = player_name_input.getText();

        player = new Player(playerOneName);

        FXMLUtils.showScreen(
                "gameScreen.fxml",
                QuoridorApplication.getMainStage(),
                1050,
                690);
    }
}
