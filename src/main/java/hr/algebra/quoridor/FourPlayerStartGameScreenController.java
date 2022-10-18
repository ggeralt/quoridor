package hr.algebra.quoridor;

import hr.algebra.quoridor.model.PlayerDetails;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FourPlayerStartGameScreenController {
    @FXML
    private TextField playerOneNameTextField;

    @FXML
    private TextField playerTwoNameTextField;

    @FXML
    private TextField playerThreeNameTextField;

    @FXML
    private TextField playerFourNameTextField;

    private PlayerDetails playerOneDetails;
    private PlayerDetails playerTwoDetails;
    private PlayerDetails playerThreeDetails;
    private PlayerDetails playerFourDetails;

    public void startTwoPlayerGame() {
        String playerOneName = playerOneNameTextField.getText();
        String playerTwoName = playerTwoNameTextField.getText();
        String playerThreeName = playerThreeNameTextField.getText();
        String playerFourName = playerFourNameTextField.getText();

        playerOneDetails = new PlayerDetails(playerOneName);
        playerTwoDetails = new PlayerDetails(playerTwoName);
        playerThreeDetails = new PlayerDetails(playerThreeName);
        playerFourDetails = new PlayerDetails(playerFourName);

        FXMLLoader fxmlLoader = null;

        fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("fourPlayerGameScreen.fxml"));

        Scene scene = null;

        try {
            scene = new Scene(fxmlLoader.load(), 600, 450);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stage stage = QuoridorApplication.getMainStage();

        stage.setTitle("Quoridor");
        stage.setScene(scene);
        stage.show();
    }
}
