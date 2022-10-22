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

    private PlayerDetails playerOneDetails;
    private PlayerDetails playerTwoDetails;

    public void startTwoPlayerGame() {
        String playerOneName = playerOneNameTextField.getText();
        String playerTwoName = playerTwoNameTextField.getText();

        playerOneDetails = new PlayerDetails(playerOneName);
        playerTwoDetails = new PlayerDetails(playerTwoName);

        FXMLLoader fxmlLoader = null;

        fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("twoPlayerGameScreen.fxml"));

        Scene scene = null;

        try {
            scene = new Scene(fxmlLoader.load(), 600, 400);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stage stage = QuoridorApplication.getMainStage();

        stage.setTitle("Quoridor");
        stage.setScene(scene);
        stage.show();
    }
}
