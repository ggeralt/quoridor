package hr.algebra.quoridor;

import hr.algebra.quoridor.model.PlayerDetails;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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

    public void startTwoPlayerGame() {
        FXMLLoader fxmlLoader = null;
        Scene scene = null;
        Stage stage = QuoridorApplication.getMainStage();

        String playerOneName = playerOneNameTextField.getText();
        String playerTwoName = playerTwoNameTextField.getText();

        playerOneDetails = new PlayerDetails(playerOneName);
        playerTwoDetails = new PlayerDetails(playerTwoName);

        fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("twoPlayerGameScreen.fxml"));

        try {
            scene = new Scene(fxmlLoader.load(), 1154, 690);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
}
