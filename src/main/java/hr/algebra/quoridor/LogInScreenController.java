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
    private TextField playerOneNameTextField;
    @FXML
    private TextField playerTwoNameTextField;

    private static Player playerOne;
    private static Player playerTwo;

    public static Player getPlayerOne() {
        return playerOne;
    }

    public static Player getPlayerTwo() {
        return playerTwo;
    }

    public void startGame() throws IOException {
        if (playerOneNameTextField.getText().isBlank() && playerTwoNameTextField.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Blank player names",
                    null,
                    "Player names are blank!");

            return;
        }
        else if (playerOneNameTextField.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Blank player name",
                    null,
                    "Player one name is blank!");

            return;
        }
        else if (playerTwoNameTextField.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Blank player name",
                    null,
                    "Player two name is blank!");

            return;
        }

        String playerOneName = playerOneNameTextField.getText();
        String playerTwoName = playerTwoNameTextField.getText();

        playerOne = new Player(playerOneName);
        playerTwo = new Player(playerTwoName);

        FXMLUtils.showScreen(
                "gameScreen.fxml",
                QuoridorApplication.getMainStage(),
                1050,
                690);
    }
}
