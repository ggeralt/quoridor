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

    public void startTwoPlayerGame() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("twoPlayerGameScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1154, 690);
        Stage stage = QuoridorApplication.getMainStage();

        stage.setTitle("Quoridor");
        stage.setScene(scene);
        stage.show();

        String playerOneName = playerOneNameTextField.getText();
        String playerTwoName = playerTwoNameTextField.getText();

        playerOneDetails = new PlayerDetails(playerOneName);
        playerTwoDetails = new PlayerDetails(playerTwoName);
    }

    public static PlayerDetails getPlayerOneDetails() {
        return playerOneDetails;
    }

    public static PlayerDetails getPlayerTwoDetails() {
        return playerTwoDetails;
    }
}
