package hr.algebra.quoridor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TwoPlayerGameScreenController implements Initializable {

    @FXML
    private Button button_0_0;
    @FXML
    private Button button_0_1;
    @FXML
    private Button button_0_2;
    @FXML
    private Button button_0_3;
    @FXML
    private Button button_0_4;
    @FXML
    private Button button_0_5;
    @FXML
    private Button button_0_6;
    @FXML
    private Button button_0_7;
    @FXML
    private Button button_0_8;
    @FXML
    private Button button_0_9;
    @FXML
    private Button button_0_10;
    @FXML
    private Button button_9_5;
    @FXML
    private Button button_10_0;
    @FXML
    private Button button_10_1;
    @FXML
    private Button button_10_2;
    @FXML
    private Button button_10_3;
    @FXML
    private Button button_10_4;
    @FXML
    private Button button_10_5;
    @FXML
    private Button button_10_6;
    @FXML
    private Button button_10_7;
    @FXML
    private Button button_10_8;
    @FXML
    private Button button_10_9;
    @FXML
    private Button button_10_10;

    private static final int GAME_BOARD_WIDTH = 11;
    private static final int GAME_BOARD_HEIGHT = 11;

    private static int turnCounter = 0;

    private Boolean playerOneTurn;
    private Boolean testBool;

    private Button gameBoard[][];
    private Button playerOnePosition;
    private Button playerTwoPosition;

    private Button pressedButton;
    private List<Button> listOfPressedButtons = new ArrayList<>();

    public void buttonPressed(ActionEvent actionEvent) {
        if (turnCounter > 1 && listOfPressedButtons.size() == 2) {
            listOfPressedButtons.get(0).setText("");
            listOfPressedButtons.remove(0);
        }

        pressedButton = (Button)actionEvent.getSource();

        if("".equals(pressedButton.getText()) == false) {
            return;
        }

        if (turnCounter == 1) {
            button_0_5.setText("");
        }

        if(playerOneTurn) {
            // TODO: parse x and y index
            // playerOnePosition.getId()
            if (pressedButton == gameBoard[10][4] || pressedButton == gameBoard[10][6] || pressedButton == gameBoard[9][5]) {
                if (turnCounter == 0) {
                    button_10_5.setText("");
                }

                pressedButton.setText("1");
                playerOnePosition = pressedButton;
                playerOneTurn = !playerOneTurn;
                turnCounter++;
                listOfPressedButtons.add(pressedButton);
            }
            else {
                playerOneTurn = true;
            }
        }
        else {
            pressedButton.setText("2");
            playerTwoPosition = pressedButton;
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        testBool = true;
        playerOneTurn = true;

        gameBoard = new Button[GAME_BOARD_HEIGHT][GAME_BOARD_WIDTH];

        gameBoard[0][0] = button_0_0;
        gameBoard[0][1] = button_0_1;
        gameBoard[0][2] = button_0_2;
        gameBoard[0][3] = button_0_3;
        gameBoard[0][4] = button_0_4;
        gameBoard[0][5] = button_0_5;
        gameBoard[0][6] = button_0_6;
        gameBoard[0][7] = button_0_7;
        gameBoard[0][8] = button_0_8;
        gameBoard[0][9] = button_0_9;
        gameBoard[9][5] = button_9_5;
        gameBoard[0][10] = button_0_10;
        gameBoard[10][0] = button_10_0;
        gameBoard[10][1] = button_10_1;
        gameBoard[10][2] = button_10_2;
        gameBoard[10][3] = button_10_3;
        gameBoard[10][4] = button_10_4;
        gameBoard[10][5] = button_10_5;
        gameBoard[10][6] = button_10_6;
        gameBoard[10][7] = button_10_7;
        gameBoard[10][8] = button_10_8;
        gameBoard[10][9] = button_10_9;
        gameBoard[10][10] = button_10_10;

        playerOnePosition = button_10_5;
        playerTwoPosition = button_0_5;

        button_0_5.setText("2");
        button_10_5.setText("1");
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
