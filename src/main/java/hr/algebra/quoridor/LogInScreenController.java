package hr.algebra.quoridor;

import hr.algebra.quoridor.model.PlayerDetails;
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

    private static PlayerDetails playerOneDetails;
    private static PlayerDetails playerTwoDetails;

    public static PlayerDetails getPlayerOneDetails() {
        return playerOneDetails;
    }

    public static PlayerDetails getPlayerTwoDetails() {
        return playerTwoDetails;
    }

    public void startGame() throws IOException {
        if (playerOneNameTextField.getText().isBlank() && playerTwoNameTextField.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Empty player name",
                    null,
                    "Player names are empty!");

            return;
        }
        else if (playerOneNameTextField.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Empty player name",
                    null,
                    "Player one name is empty!");

            return;
        }
        else if (playerTwoNameTextField.getText().isBlank()) {
            AlertUtils.showAlert(
                    ERROR,
                    "Empty player name",
                    null,
                    "Player two name is empty!");

            return;
        }

        String playerOneName = playerOneNameTextField.getText();
        String playerTwoName = playerTwoNameTextField.getText();

        playerOneDetails = new PlayerDetails(playerOneName);
        playerTwoDetails = new PlayerDetails(playerTwoName);

        FXMLUtils.showScreen(
                "gameScreen.fxml",
                QuoridorApplication.getMainStage(),
                1050,
                690);
    }
}
