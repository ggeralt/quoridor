package hr.algebra.quoridor;

import hr.algebra.quoridor.model.PlayerDetails;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class TwoPlayerStartGameScreenController {
    @FXML
    private TextField playerOneNameTextField;
    @FXML
    private TextField playerTwoNameTextField;

    private static PlayerDetails playerOneDetails;
    private static PlayerDetails playerTwoDetails;

    public void startTwoPlayerGame() throws IOException {
        if (playerOneNameTextField.getText().isEmpty() && playerTwoNameTextField.getText().isEmpty()) {
            emptyPlayerNameErrorAlert("Player names are empty!");
            return;
        }
        else if (playerOneNameTextField.getText().isEmpty()) {
            emptyPlayerNameErrorAlert("Player one name is empty!");
            return;
        }
        else if (playerTwoNameTextField.getText().isEmpty()) {
            emptyPlayerNameErrorAlert("Player two name is empty!");
            return;
        }

        String playerOneName = playerOneNameTextField.getText();
        String playerTwoName = playerTwoNameTextField.getText();

        playerOneDetails = new PlayerDetails(playerOneName);
        playerTwoDetails = new PlayerDetails(playerTwoName);

        FXMLLoader fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("twoPlayerGameScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 690);
        Stage stage = QuoridorApplication.getMainStage();
        
        stage.setTitle("Quoridor");
        stage.setScene(scene);
        stage.show();
    }

    public static PlayerDetails getPlayerOneDetails() {
        return playerOneDetails;
    }

    public static PlayerDetails getPlayerTwoDetails() {
        return playerTwoDetails;
    }

    private void emptyPlayerNameErrorAlert(String string) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Empty player name");
        alert.setContentText(string);
        alert.showAndWait();
    }
}
