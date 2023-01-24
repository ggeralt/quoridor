package hr.algebra.quoridor;

import hr.algebra.quoridor.model.Player;
import hr.algebra.quoridor.util.AlertUtils;
import hr.algebra.quoridor.util.FXMLUtils;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

import static javafx.scene.control.Alert.AlertType.ERROR;

public class LogInScreenController {
    @FXML
    private TextField player_one_name_input;
    @FXML
    private TextField player_two_name_input;

    private static Player playerOne;
    private static Player playerTwo;

    public static Player getPlayerOne() {
        return playerOne;
    }

    public static Player getPlayerTwo() {
        return playerTwo;
    }

    public void startGame() throws IOException {
        if (player_one_name_input.getText().isBlank() && player_two_name_input.getText().isBlank()) {
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
        }

        String playerOneName = player_one_name_input.getText();
        String playerTwoName = player_two_name_input.getText();

        playerOne = new Player(playerOneName);
        playerTwo = new Player(playerTwoName);

        FXMLUtils.showScreen(
                "gameScreen.fxml",
                QuoridorApplication.getMainStage(),
                1050,
                690);
    }
}
