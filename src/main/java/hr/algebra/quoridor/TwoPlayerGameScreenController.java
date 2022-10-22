package hr.algebra.quoridor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class TwoPlayerGameScreenController implements Initializable {

    private static final int GAME_BOARD_WIDTH = 9;
    private static final int GAME_BOARD_HEIGHT = 9;

    private static int turnCounter = 0;

    private Boolean playerOneTurn;

    private Button pressedButton;
    private List<Button> listOfPressedButtons = new ArrayList<Button>();

    public void buttonPressed(ActionEvent actionEvent) {
        if (turnCounter > 1 && listOfPressedButtons.size() == 2) {
            listOfPressedButtons.get(0).setText("");
            listOfPressedButtons.remove(0);
        }

        pressedButton = (Button)actionEvent.getSource();

        if("".equals(pressedButton.getText()) == false) {
            return;
        }

        turnCounter++;

        if(playerOneTurn) {
            pressedButton.setText("1");
        }
        else {
            pressedButton.setText("2");
        }

        playerOneTurn = !playerOneTurn;

        listOfPressedButtons.add(pressedButton);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerOneTurn = true;
    }

    public void startTwoPlayerGame() {
        FXMLLoader fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("twoPlayerGameScreen.fxml"));

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
