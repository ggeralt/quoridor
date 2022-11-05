package hr.algebra.quoridor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    private Button button_1_0;
    @FXML
    private Button button_1_1;
    @FXML
    private Button button_1_2;
    @FXML
    private Button button_1_3;
    @FXML
    private Button button_1_4;
    @FXML
    private Button button_1_5;
    @FXML
    private Button button_1_6;
    @FXML
    private Button button_1_7;
    @FXML
    private Button button_1_8;
    @FXML
    private Button button_1_9;
    @FXML
    private Button button_1_10;
    @FXML
    private Button button_2_0;
    @FXML
    private Button button_2_1;
    @FXML
    private Button button_2_2;
    @FXML
    private Button button_2_3;
    @FXML
    private Button button_2_4;
    @FXML
    private Button button_2_5;
    @FXML
    private Button button_2_6;
    @FXML
    private Button button_2_7;
    @FXML
    private Button button_2_8;
    @FXML
    private Button button_2_9;
    @FXML
    private Button button_2_10;
    @FXML
    private Button button_3_0;
    @FXML
    private Button button_3_1;
    @FXML
    private Button button_3_2;
    @FXML
    private Button button_3_3;
    @FXML
    private Button button_3_4;
    @FXML
    private Button button_3_5;
    @FXML
    private Button button_3_6;
    @FXML
    private Button button_3_7;
    @FXML
    private Button button_3_8;
    @FXML
    private Button button_3_9;
    @FXML
    private Button button_3_10;
    @FXML
    private Button button_4_0;
    @FXML
    private Button button_4_1;
    @FXML
    private Button button_4_2;
    @FXML
    private Button button_4_3;
    @FXML
    private Button button_4_4;
    @FXML
    private Button button_4_5;
    @FXML
    private Button button_4_6;
    @FXML
    private Button button_4_7;
    @FXML
    private Button button_4_8;
    @FXML
    private Button button_4_9;
    @FXML
    private Button button_4_10;
    @FXML
    private Button button_5_0;
    @FXML
    private Button button_5_1;
    @FXML
    private Button button_5_2;
    @FXML
    private Button button_5_3;
    @FXML
    private Button button_5_4;
    @FXML
    private Button button_5_5;
    @FXML
    private Button button_5_6;
    @FXML
    private Button button_5_7;
    @FXML
    private Button button_5_8;
    @FXML
    private Button button_5_9;
    @FXML
    private Button button_5_10;
    @FXML
    private Button button_6_0;
    @FXML
    private Button button_6_1;
    @FXML
    private Button button_6_2;
    @FXML
    private Button button_6_3;
    @FXML
    private Button button_6_4;
    @FXML
    private Button button_6_5;
    @FXML
    private Button button_6_6;
    @FXML
    private Button button_6_7;
    @FXML
    private Button button_6_8;
    @FXML
    private Button button_6_9;
    @FXML
    private Button button_6_10;
    @FXML
    private Button button_7_0;
    @FXML
    private Button button_7_1;
    @FXML
    private Button button_7_2;
    @FXML
    private Button button_7_3;
    @FXML
    private Button button_7_4;
    @FXML
    private Button button_7_5;
    @FXML
    private Button button_7_6;
    @FXML
    private Button button_7_7;
    @FXML
    private Button button_7_8;
    @FXML
    private Button button_7_9;
    @FXML
    private Button button_7_10;
    @FXML
    private Button button_8_0;
    @FXML
    private Button button_8_1;
    @FXML
    private Button button_8_2;
    @FXML
    private Button button_8_3;
    @FXML
    private Button button_8_4;
    @FXML
    private Button button_8_5;
    @FXML
    private Button button_8_6;
    @FXML
    private Button button_8_7;
    @FXML
    private Button button_8_8;
    @FXML
    private Button button_8_9;
    @FXML
    private Button button_8_10;
    @FXML
    private Button button_9_0;
    @FXML
    private Button button_9_1;
    @FXML
    private Button button_9_2;
    @FXML
    private Button button_9_3;
    @FXML
    private Button button_9_4;
    @FXML
    private Button button_9_5;
    @FXML
    private Button button_9_6;
    @FXML
    private Button button_9_7;
    @FXML
    private Button button_9_8;
    @FXML
    private Button button_9_9;
    @FXML
    private Button button_9_10;
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
    private Button gameBoard[][];
    private Button playerOnePosition;
    private Button playerTwoPosition;
    private Button pressedButton;
    private List<Button> listOfPressedButtons = new ArrayList<>();

    public void buttonPressed(ActionEvent actionEvent) {

        pressedButton = (Button)actionEvent.getSource();

        if("".equals(pressedButton.getText()) == false) {
            return;
        }

        if (playerOneTurn) {
            String[] ids = playerOnePosition.getId().split("_", 3);
            int X = Integer.parseInt(ids[1]);
            int Y = Integer.parseInt(ids[2]);

            if (X == 1) {
                if (pressedButton == gameBoard[0][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerOneInput();
                    announceWinner();
                }
            }

            if (X == 10 && Y == 10) {
                if (pressedButton == gameBoard[X][Y - 1] || pressedButton == gameBoard[X - 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerOneInput();
                }
                else {
                    playerOneTurn = true;
                }
            }
            else if (X == 10 && Y == 0) {
                if (pressedButton == gameBoard[X][Y + 1] || pressedButton == gameBoard[X - 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerOneInput();
                }
                else {
                    playerOneTurn = true;
                }
            }
            else if (X == 10) {
                if (pressedButton == gameBoard[X][Y - 1] || pressedButton == gameBoard[X][Y + 1] || pressedButton == gameBoard[X - 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerOneInput();
                }
                else {
                    playerOneTurn = true;
                }
            }
            else if (Y == 10) {
                if (pressedButton == gameBoard[X][Y - 1] || pressedButton == gameBoard[X - 1][Y] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerOneInput();
                }
                else {
                    playerOneTurn = true;
                }
            }
            else if (Y == 0) {
                if (pressedButton == gameBoard[X][Y + 1] || pressedButton == gameBoard[X - 1][Y] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerOneInput();
                }
                else {
                    playerOneTurn = true;
                }
            }
            else {
                if (pressedButton == gameBoard[X][Y - 1] || pressedButton == gameBoard[X][Y + 1] || pressedButton == gameBoard[X - 1][Y] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerOneInput();
                }
                else {
                    playerOneTurn = true;
                }
            }
        }
        else {
            String[] ids = playerTwoPosition.getId().split("_", 3);
            int X = Integer.parseInt(ids[1]);
            int Y = Integer.parseInt(ids[2]);

            if (X == 9) {
                if (pressedButton == gameBoard[10][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerTwoInput();
                    announceWinner();
                }
            }

            if (X == 0 && Y == 10) {
                if (pressedButton == gameBoard[X][Y - 1] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerTwoInput();
                }
                else {
                    playerOneTurn = false;
                }
            }
            else if (X == 0 && Y == 0) {
                if (pressedButton == gameBoard[X][Y + 1] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerTwoInput();
                }
                else {
                    playerOneTurn = false;
                }
            }
            else if (X == 0) {
                if (pressedButton == gameBoard[X][Y - 1] || pressedButton == gameBoard[X][Y + 1] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerTwoInput();
                }
                else {
                    playerOneTurn = false;
                }
            }
            else if (Y == 10) {
                if (pressedButton == gameBoard[X][Y - 1] || pressedButton == gameBoard[X - 1][Y] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerTwoInput();
                }
                else {
                    playerOneTurn = false;
                }
            }
            else if (Y == 0) {
                if (pressedButton == gameBoard[X][Y + 1] || pressedButton == gameBoard[X - 1][Y] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerTwoInput();
                }
                else {
                    playerOneTurn = false;
                }
            }
            else {
                if (pressedButton == gameBoard[X][Y - 1] || pressedButton == gameBoard[X][Y + 1] || pressedButton == gameBoard[X - 1][Y] || pressedButton == gameBoard[X + 1][Y]) {
                    checkPreviouslyClickedButtons();
                    applyPlayerTwoInput();
                }
                else {
                    playerOneTurn = false;
                }
            }
        }
    }

    private void announceWinner() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("GAME OVER");

        if(!playerOneTurn) {
            alert.setContentText("The winner is " + TwoPlayerStartGameScreenController.getPlayerOneDetails().getPlayerName());
            TwoPlayerStartGameScreenController.getPlayerOneDetails().recordWin();
        }
        else {
            alert.setContentText("The winner is " + TwoPlayerStartGameScreenController.getPlayerTwoDetails().getPlayerName());
            TwoPlayerStartGameScreenController.getPlayerTwoDetails().recordWin();
        }

        alert.showAndWait();

        System.out.println("Number of wins (" + TwoPlayerStartGameScreenController.getPlayerOneDetails().getPlayerName() + "): "
                + TwoPlayerStartGameScreenController.getPlayerOneDetails().getNumberOfWins());

        System.out.println("Number of wins (" + TwoPlayerStartGameScreenController.getPlayerTwoDetails().getPlayerName() + "): "
                + TwoPlayerStartGameScreenController.getPlayerTwoDetails().getNumberOfWins());

        turnCounter = 0;

        return;
    }

    private void checkPreviouslyClickedButtons() {
        if (listOfPressedButtons.size() > 1) {
            listOfPressedButtons.get(0).setText("");
            listOfPressedButtons.remove(0);
        }
    }

    private void applyPlayerOneInput() {
        pressedButton.setText("1");
        playerOnePosition = pressedButton;
        playerOneTurn = false;
        turnCounter++;
        listOfPressedButtons.add(pressedButton);
    }

    private void applyPlayerTwoInput() {
        pressedButton.setText("2");
        playerTwoPosition = pressedButton;
        playerOneTurn = true;
        turnCounter++;
        listOfPressedButtons.add(pressedButton);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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
        gameBoard[0][10] = button_0_10;
        gameBoard[1][0] = button_1_0;
        gameBoard[1][1] = button_1_1;
        gameBoard[1][2] = button_1_2;
        gameBoard[1][3] = button_1_3;
        gameBoard[1][4] = button_1_4;
        gameBoard[1][5] = button_1_5;
        gameBoard[1][6] = button_1_6;
        gameBoard[1][7] = button_1_7;
        gameBoard[1][8] = button_1_8;
        gameBoard[1][9] = button_1_9;
        gameBoard[1][10] = button_1_10;
        gameBoard[2][0] = button_2_0;
        gameBoard[2][1] = button_2_1;
        gameBoard[2][2] = button_2_2;
        gameBoard[2][3] = button_2_3;
        gameBoard[2][4] = button_2_4;
        gameBoard[2][5] = button_2_5;
        gameBoard[2][6] = button_2_6;
        gameBoard[2][7] = button_2_7;
        gameBoard[2][8] = button_2_8;
        gameBoard[2][9] = button_2_9;
        gameBoard[2][10] = button_2_10;
        gameBoard[3][0] = button_3_0;
        gameBoard[3][1] = button_3_1;
        gameBoard[3][2] = button_3_2;
        gameBoard[3][3] = button_3_3;
        gameBoard[3][4] = button_3_4;
        gameBoard[3][5] = button_3_5;
        gameBoard[3][6] = button_3_6;
        gameBoard[3][7] = button_3_7;
        gameBoard[3][8] = button_3_8;
        gameBoard[3][9] = button_3_9;
        gameBoard[3][10] = button_3_10;
        gameBoard[4][0] = button_4_0;
        gameBoard[4][1] = button_4_1;
        gameBoard[4][2] = button_4_2;
        gameBoard[4][3] = button_4_3;
        gameBoard[4][4] = button_4_4;
        gameBoard[4][5] = button_4_5;
        gameBoard[4][6] = button_4_6;
        gameBoard[4][7] = button_4_7;
        gameBoard[4][8] = button_4_8;
        gameBoard[4][9] = button_4_9;
        gameBoard[4][10] = button_4_10;
        gameBoard[5][0] = button_5_0;
        gameBoard[5][1] = button_5_1;
        gameBoard[5][2] = button_5_2;
        gameBoard[5][3] = button_5_3;
        gameBoard[5][4] = button_5_4;
        gameBoard[5][5] = button_5_5;
        gameBoard[5][6] = button_5_6;
        gameBoard[5][7] = button_5_7;
        gameBoard[5][8] = button_5_8;
        gameBoard[5][9] = button_5_9;
        gameBoard[5][10] = button_5_10;
        gameBoard[6][0] = button_6_0;
        gameBoard[6][1] = button_6_1;
        gameBoard[6][2] = button_6_2;
        gameBoard[6][3] = button_6_3;
        gameBoard[6][4] = button_6_4;
        gameBoard[6][5] = button_6_5;
        gameBoard[6][6] = button_6_6;
        gameBoard[6][7] = button_6_7;
        gameBoard[6][8] = button_6_8;
        gameBoard[6][9] = button_6_9;
        gameBoard[6][10] = button_6_10;
        gameBoard[7][0] = button_7_0;
        gameBoard[7][1] = button_7_1;
        gameBoard[7][2] = button_7_2;
        gameBoard[7][3] = button_7_3;
        gameBoard[7][4] = button_7_4;
        gameBoard[7][5] = button_7_5;
        gameBoard[7][6] = button_7_6;
        gameBoard[7][7] = button_7_7;
        gameBoard[7][8] = button_7_8;
        gameBoard[7][9] = button_7_9;
        gameBoard[7][10] = button_7_10;
        gameBoard[8][0] = button_8_0;
        gameBoard[8][1] = button_8_1;
        gameBoard[8][2] = button_8_2;
        gameBoard[8][3] = button_8_3;
        gameBoard[8][4] = button_8_4;
        gameBoard[8][5] = button_8_5;
        gameBoard[8][6] = button_8_6;
        gameBoard[8][7] = button_8_7;
        gameBoard[8][8] = button_8_8;
        gameBoard[8][9] = button_8_9;
        gameBoard[8][10] = button_8_10;
        gameBoard[9][0] = button_9_0;
        gameBoard[9][1] = button_9_1;
        gameBoard[9][2] = button_9_2;
        gameBoard[9][3] = button_9_3;
        gameBoard[9][4] = button_9_4;
        gameBoard[9][5] = button_9_5;
        gameBoard[9][6] = button_9_6;
        gameBoard[9][7] = button_9_7;
        gameBoard[9][8] = button_9_8;
        gameBoard[9][9] = button_9_9;
        gameBoard[9][10] = button_9_10;
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

        listOfPressedButtons.add(playerOnePosition);
        listOfPressedButtons.add(playerTwoPosition);
    }

    public void startTwoPlayerGame() {
        FXMLLoader fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("twoPlayerGameScreen.fxml"));

        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 1154, 690);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stage stage = QuoridorApplication.getMainStage();

        stage.setTitle("Quoridor");
        stage.setScene(scene);
        stage.show();
    }
}
