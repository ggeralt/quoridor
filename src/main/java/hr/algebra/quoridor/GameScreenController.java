package hr.algebra.quoridor;

import hr.algebra.quoridor.model.SerializableButton;
import hr.algebra.quoridor.util.AlertUtils;
import hr.algebra.quoridor.util.FXMLUtils;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import static javafx.scene.control.Alert.AlertType.ERROR;
import static javafx.scene.control.Alert.AlertType.INFORMATION;

public class GameScreenController implements Initializable {
    @FXML
    private Label player_one_name;
    @FXML
    private Label player_two_name;
    @FXML
    private Label player_one_score;
    @FXML
    private Label player_two_score;
    @FXML
    private Label player_turn_name;
    @FXML
    private Label player_one_walls;
    @FXML
    private Label player_two_walls;
    @FXML
    private Label turn_counter;
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
    @FXML
    private ListView<String> player_moves;

    private static final int GAME_BOARD_WIDTH = 11;
    private static final int GAME_BOARD_HEIGHT = 11;
    private static final String CLASS_EXTENSION = ".class";
    private static final String SAVED_GAME_FILE = "savedGame.ser";
    private static final String WHITE_PAWN = "♙";
    private static final String BLACK_PAWN = "♟";
    private static int wallButtonPlacementCounter;
    private static int playerOneWalls;
    private static int playerTwoWalls;
    private static int X_wall;
    private static int Y_wall;
    private boolean playerOneTurn;
    private int turnCounter;
    private Button playerOnePosition;
    private Button playerOnePreviousPosition;
    private Button playerTwoPosition;
    private Button playerTwoPreviousPosition;
    private Button pressedButton;
    private Button firstPlacedWall;
    private Button[][] gameBoard;
    private final ObservableList<String> playerMovesObservable = FXCollections.observableArrayList();

    private final Image wall = new Image(Objects.requireNonNull(getClass().getResourceAsStream("image/wall.png")));

    public void wallButtonPressed() {
        if (wallButtonPlacementCounter == 0 && ((playerOneTurn && playerOneWalls != 0) || (!playerOneTurn && playerTwoWalls != 0))) {
            for (int i = 0; i < GAME_BOARD_WIDTH; i++) {
                for (int j = 0; j < GAME_BOARD_HEIGHT; j++) {
                    if
                    (       gameBoard[i][j].getText().isEmpty() &&
                            gameBoard[i][j] != gameBoard[10][j] &&
                            gameBoard[i][j] != gameBoard[0][j] &&
                            gameBoard[i][j] != gameBoard[i][10] &&
                            gameBoard[i][j] != gameBoard[i][0]
                    )
                    {
                        gameBoard[i][j].setGraphic(new ImageView(wall));
                    }
                }
            }

            wallButtonPlacementCounter = 2;
        }
    }

    public void buttonPressed(ActionEvent actionEvent) {
        pressedButton = (Button)actionEvent.getSource();

        if (!"".equals(pressedButton.getText())) {
            return;
        }

        if (playerOneTurn) {
            if (wallButtonPlacementCounter != 0 && playerOneWalls != 0 && checkInvalidWallPlacement()) {
                if (wallButtonPlacementCounter == 2) {
                    setFirstWall();
                }
                else {
                    if (Y_wall == 0) {
                        if (pressedButton == gameBoard[X_wall][Y_wall + 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            setSecondWall();
                        }
                    }
                    else if (Y_wall == 10) {
                        if (pressedButton == gameBoard[X_wall][Y_wall - 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            setSecondWall();
                        }
                    }
                    else {
                        if (pressedButton == gameBoard[X_wall][Y_wall + 1] || pressedButton == gameBoard[X_wall][Y_wall - 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            setSecondWall();
                        }
                    }
                }

                turn_counter.setText(String.valueOf(turnCounter));
                player_moves.scrollTo(player_moves.getItems().size());

                return;
            }

            if (wallButtonPlacementCounter == 0 || (wallButtonPlacementCounter == 2 && playerOneWalls == 0)) {
                int X1 = Integer.parseInt(playerOnePosition.getId().split("_", 3)[1]);
                int Y1 = Integer.parseInt(playerOnePosition.getId().split("_", 3)[2]);

                wallButtonPlacementCounter = 0;

                if (X1 == 1) {
                    if (pressedButton == gameBoard[0][Y1]) {
                        applyPlayerInput();
                        announceWinner();
                    }
                }

                if (X1 == 10 && Y1 == 10) {
                    if (pressedButton == gameBoard[X1][Y1 - 1] || pressedButton == gameBoard[X1 - 1][Y1]) {
                        applyPlayerInput();
                    }
                }
                else if (X1 == 10 && Y1 == 0) {
                    if (pressedButton == gameBoard[X1][Y1 + 1] || pressedButton == gameBoard[X1 - 1][Y1]) {
                        applyPlayerInput();
                    }
                }
                else if (X1 == 10) {
                    if (pressedButton == gameBoard[X1][Y1 - 1] || pressedButton == gameBoard[X1][Y1 + 1] || pressedButton == gameBoard[X1 - 1][Y1]) {
                        applyPlayerInput();
                    }
                }
                else if (Y1 == 10) {
                    if (pressedButton == gameBoard[X1][Y1 - 1] || pressedButton == gameBoard[X1 - 1][Y1] || pressedButton == gameBoard[X1 + 1][Y1]) {
                        applyPlayerInput();
                    }
                }
                else if (Y1 == 0) {
                    if (pressedButton == gameBoard[X1][Y1 + 1] || pressedButton == gameBoard[X1 - 1][Y1] || pressedButton == gameBoard[X1 + 1][Y1]) {
                        applyPlayerInput();
                    }
                }
                else {
                    if (pressedButton == gameBoard[X1][Y1 - 1] || pressedButton == gameBoard[X1][Y1 + 1] || pressedButton == gameBoard[X1 - 1][Y1] || pressedButton == gameBoard[X1 + 1][Y1]) {
                        applyPlayerInput();
                    }
                }
            }
        }
        else {
            if (wallButtonPlacementCounter != 0 && playerTwoWalls != 0 && checkInvalidWallPlacement()) {
                if (wallButtonPlacementCounter == 2) {
                    setFirstWall();
                }
                else {
                    if (Y_wall == 0) {
                        if (pressedButton == gameBoard[X_wall][Y_wall + 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            setSecondWall();
                        }
                    }
                    else if (Y_wall == 10) {
                        if (pressedButton == gameBoard[X_wall][Y_wall - 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            setSecondWall();
                        }
                    }
                    else {
                        if (pressedButton == gameBoard[X_wall][Y_wall + 1] || pressedButton == gameBoard[X_wall][Y_wall - 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            setSecondWall();
                        }
                    }
                }

                turn_counter.setText(String.valueOf(turnCounter));
                player_moves.scrollTo(player_moves.getItems().size());

                return;
            }

            if (wallButtonPlacementCounter == 0 || (wallButtonPlacementCounter == 2 && playerTwoWalls == 0)) {
                int X2 = Integer.parseInt(playerTwoPosition.getId().split("_", 3)[1]);
                int Y2 = Integer.parseInt(playerTwoPosition.getId().split("_", 3)[2]);

                wallButtonPlacementCounter = 0;

                if (X2 == 9) {
                    if (pressedButton == gameBoard[10][Y2]) {
                        applyPlayerInput();
                        announceWinner();
                    }
                }

                if (X2 == 0 && Y2 == 10) {
                    if (pressedButton == gameBoard[X2][Y2 - 1] || pressedButton == gameBoard[X2 + 1][Y2]) {
                        applyPlayerInput();
                    }
                }
                else if (X2 == 0 && Y2 == 0) {
                    if (pressedButton == gameBoard[X2][Y2 + 1] || pressedButton == gameBoard[X2 + 1][Y2]) {
                        applyPlayerInput();
                    }
                }
                else if (X2 == 0) {
                    if (pressedButton == gameBoard[X2][Y2 - 1] || pressedButton == gameBoard[X2][Y2 + 1] || pressedButton == gameBoard[X2 + 1][Y2]) {
                        applyPlayerInput();
                    }
                }
                else if (Y2 == 10) {
                    if (pressedButton == gameBoard[X2][Y2 - 1] || pressedButton == gameBoard[X2 - 1][Y2] || pressedButton == gameBoard[X2 + 1][Y2]) {
                        applyPlayerInput();
                    }
                }
                else if (Y2 == 0) {
                    if (pressedButton == gameBoard[X2][Y2 + 1] || pressedButton == gameBoard[X2 - 1][Y2] || pressedButton == gameBoard[X2 + 1][Y2]) {
                        applyPlayerInput();
                    }
                }
                else {
                    if (pressedButton == gameBoard[X2][Y2 - 1] || pressedButton == gameBoard[X2][Y2 + 1] || pressedButton == gameBoard[X2 - 1][Y2] || pressedButton == gameBoard[X2 + 1][Y2]) {
                        applyPlayerInput();
                    }
                }
            }
        }

        turn_counter.setText(String.valueOf(turnCounter));
        player_moves.scrollTo(player_moves.getItems().size());
    }

    private void setFirstWall() {
        firstPlacedWall = pressedButton;
        X_wall = Integer.parseInt(firstPlacedWall.getId().split("_", 3)[1]);
        Y_wall = Integer.parseInt(firstPlacedWall.getId().split("_", 3)[2]);

        for (int i = 0; i < GAME_BOARD_WIDTH; i++) {
            for (int j = 0; j < GAME_BOARD_HEIGHT; j++) {
                if
                (       gameBoard[i][j].getText().isEmpty() &&
                        gameBoard[i][j] != gameBoard[10][j] &&
                        gameBoard[i][j] != gameBoard[0][j] &&
                        gameBoard[i][j] != gameBoard[i][10] &&
                        gameBoard[i][j] != gameBoard[i][0] &&
                        gameBoard[i][j] != gameBoard[X_wall][Y_wall - 1] &&
                        gameBoard[i][j] != gameBoard[X_wall][Y_wall + 1] &&
                        gameBoard[i][j] != gameBoard[X_wall - 1][Y_wall] &&
                        gameBoard[i][j] != gameBoard[X_wall + 1][Y_wall]

                ) {
                    gameBoard[i][j].setGraphic(null);
                    firstPlacedWall.setText("");
                }
            }
        }

        pressedButton.setText("X");
        wallButtonPlacementCounter--;

        if (playerOneTurn) {
            playerOneWalls--;
            player_one_walls.setText(String.valueOf(playerOneWalls));
        }
        else {
            playerTwoWalls--;
            player_two_walls.setText(String.valueOf(playerTwoWalls));
        }

        turnCounter++;
    }

    private void setSecondWall() {
        for (int i = 0; i < GAME_BOARD_WIDTH; i++) {
            for (int j = 0; j < GAME_BOARD_HEIGHT; j++) {
                if (gameBoard[i][j].getText().isEmpty()) {
                    gameBoard[i][j].setGraphic(null);
                }
            }
        }

        pressedButton.setText("X");
        wallButtonPlacementCounter--;

        if (playerOneTurn) {
            playerMovesObservable.add(LogInScreenController.getPlayerOneDetails().getPlayerName() + ": " + "WALL: " + firstPlacedWall.getId() + ", " + pressedButton.getId());
            player_turn_name.setText(LogInScreenController.getPlayerTwoDetails().getPlayerName());
            playerOneWalls--;
            player_one_walls.setText(String.valueOf(playerOneWalls));
            playerOneTurn = false;
        }
        else {
            playerMovesObservable.add(LogInScreenController.getPlayerTwoDetails().getPlayerName() + ": " + "WALL: " + firstPlacedWall.getId() + ", " + pressedButton.getId());
            player_turn_name.setText(LogInScreenController.getPlayerOneDetails().getPlayerName());
            playerTwoWalls--;
            player_two_walls.setText(String.valueOf(playerTwoWalls));
            playerOneTurn = true;
        }

        player_moves.setItems(playerMovesObservable);
    }

    private boolean checkInvalidWallPlacement() {
        return pressedButton != button_0_0 && pressedButton != button_0_1 && pressedButton != button_0_2 && pressedButton != button_0_3 && pressedButton != button_0_4 &&
               pressedButton != button_0_5 && pressedButton != button_0_6 && pressedButton != button_0_7 && pressedButton != button_0_8 && pressedButton != button_0_9 &&
               pressedButton != button_0_10 && pressedButton != button_10_0 && pressedButton != button_10_1 && pressedButton != button_10_2 && pressedButton != button_10_3 &&
               pressedButton != button_10_4 && pressedButton != button_10_5 && pressedButton != button_10_6 && pressedButton != button_10_7 && pressedButton != button_10_8 &&
               pressedButton != button_10_9 && pressedButton != button_10_10 && pressedButton != button_1_0 && pressedButton != button_2_0 && pressedButton != button_3_0 &&
               pressedButton != button_4_0 && pressedButton != button_5_0 && pressedButton != button_6_0 && pressedButton != button_7_0 && pressedButton != button_8_0 &&
               pressedButton != button_9_0 && pressedButton != button_1_10 && pressedButton != button_2_10 && pressedButton != button_3_10 && pressedButton != button_4_10 &&
               pressedButton != button_5_10 && pressedButton != button_6_10 && pressedButton != button_7_10 && pressedButton != button_8_10 && pressedButton != button_9_10;
    }

    private void announceWinner() {
        if(!playerOneTurn) {
            AlertUtils.showAlert(
                    INFORMATION,
                    "GAME OVER",
                    null,
                    "The winner is " + LogInScreenController.getPlayerOneDetails().getPlayerName());

            LogInScreenController.getPlayerOneDetails().recordWin();
        }
        else {
            AlertUtils.showAlert(
                    INFORMATION,
                    "GAME OVER",
                    null,
                    "The winner is " + LogInScreenController.getPlayerTwoDetails().getPlayerName());

            LogInScreenController.getPlayerTwoDetails().recordWin();
        }

        System.out.println("Number of wins (" + LogInScreenController.getPlayerOneDetails().getPlayerName() + "): "
                + LogInScreenController.getPlayerOneDetails().getNumberOfWins());

        System.out.println("Number of wins (" + LogInScreenController.getPlayerTwoDetails().getPlayerName() + "): "
                + LogInScreenController.getPlayerTwoDetails().getNumberOfWins());

        try {
            startTwoPlayerGame();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void applyPlayerInput() {
        if (playerOneTurn) {
            pressedButton.setText(WHITE_PAWN);
            playerOnePosition = pressedButton;
            playerMovesObservable.add(LogInScreenController.getPlayerOneDetails().getPlayerName() + ": " + pressedButton.getId());
            player_turn_name.setText(LogInScreenController.getPlayerTwoDetails().getPlayerName());
            playerOnePreviousPosition.setText("");
            playerOnePreviousPosition = playerOnePosition;
            playerOneTurn = false;
        }
        else {
            pressedButton.setText(BLACK_PAWN);
            playerTwoPosition = pressedButton;
            playerMovesObservable.add(LogInScreenController.getPlayerTwoDetails().getPlayerName() + ": " + pressedButton.getId());
            player_turn_name.setText(LogInScreenController.getPlayerOneDetails().getPlayerName());
            playerTwoPreviousPosition.setText("");
            playerTwoPreviousPosition = playerTwoPosition;
            playerOneTurn = true;
        }

        player_moves.setItems(playerMovesObservable);
        turnCounter++;
    }

    public void generateDocumentation() {
        File documentationFile = new File("documentation.html");

        try {
            FileWriter fileWriter = new FileWriter(documentationFile);

            fileWriter.write("<!DOCTYPE html>");
            fileWriter.write("<html>");
            fileWriter.write("<head>");
            fileWriter.write("<title>Project documentation</title>");
            fileWriter.write("</head>");
            fileWriter.write("<body>");
            fileWriter.write("<h1>Project documentation</h1>");
            fileWriter.write("<b><p>Class list:</p></b>");

            List<Path> paths = Files.walk(Paths.get("."))
                    .filter(path -> path
                            .getFileName()
                            .toString()
                            .endsWith(CLASS_EXTENSION))
                    .toList();

            for (Path path : paths) {
                boolean startBuildingPath = false;
                String[] tokens = path.toString().split(Pattern.quote(System.getProperty("file.separator")));
                StringBuilder stringBuilder = new StringBuilder();

                for (String token : tokens) {
                    if ("classes".equals(token)) {
                        startBuildingPath = true;
                        continue;
                    }

                    if (startBuildingPath) {
                        if (token.endsWith(CLASS_EXTENSION)) {
                            stringBuilder.append(token, 0, token.indexOf("."));
                        }
                        else {
                            stringBuilder.append(token);
                            stringBuilder.append(".");
                        }
                    }
                }

                if ("module-info".equals(stringBuilder.toString())) {
                    continue;
                }

                try {
                    Class<?> c = Class.forName(stringBuilder.toString());
                    StringBuilder classFieldString = new StringBuilder();

                    fileWriter.write("<h2>" + Modifier.toString(c.getModifiers()) + " " + c.getName() + "</h2>");

                    for (Field classField : c.getDeclaredFields()) {
                        Annotation[] annotations = classField.getAnnotations();

                        if (annotations.length != 0) {
                            for (Annotation annotation : annotations) {
                                classFieldString.append(annotation.toString());
                                classFieldString.append("<br />");
                            }
                        }

                        classFieldString.append(Modifier.toString(classField.getModifiers()));
                        classFieldString.append(" ");
                        classFieldString.append(classField.getType().getSimpleName());
                        classFieldString.append(" ");
                        classFieldString.append(classField.getName());
                        classFieldString.append(" ");
                        classFieldString.append("<br />");
                    }

                    fileWriter.write("<h3>Fields</h3>");

                    fileWriter.write("<h4>" + classFieldString + "</h4>");

                    Constructor[] constructors = c.getConstructors();

                    fileWriter.write("<h3>Constructors</h3>");

                    for (Constructor constructor : constructors) {
                        String constructorParameters = generateDocumentation(constructor);
                        fileWriter.write("<h4>Constructor: "
                                + Modifier.toString(constructor.getModifiers())
                                + " " + constructor.getName()
                                + "(" + constructorParameters + ")"
                                + "</h4>");
                    }

                    Method[] methods = c.getMethods();

                    fileWriter.write("<h3>Methods</h3>");

                    for (Method method : methods) {
                        String methodParameters = generateDocumentation(method);
                        StringBuilder exceptionsStringBuilder = new StringBuilder();

                        for (int i = 0; i < method.getExceptionTypes().length; i++) {
                            if (exceptionsStringBuilder.isEmpty()) {
                                exceptionsStringBuilder.append(" throws ");
                            }

                            Class<?> exceptionClass = method.getExceptionTypes()[i];
                            exceptionsStringBuilder.append(exceptionClass.getSimpleName());

                            if (i < method.getExceptionTypes().length - 1) {
                                exceptionsStringBuilder.append(", ");
                            }
                        }

                        fileWriter.write("<h4>Method: " + Modifier.toString(method.getModifiers())
                                + " " + method.getReturnType().getSimpleName()
                                + " " + method.getName() + "(" + methodParameters + ")"
                                + " " + exceptionsStringBuilder
                                + "</h4>");
                    }

                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }

            fileWriter.write("</body>");
            fileWriter.write("</html>");
            fileWriter.close();
        } catch (IOException e) {
            AlertUtils.showAlert(
                    ERROR,
                    "Project documentation",
                    "Cannot find the files",
                    "The class files cannot be accessed.");
        }

        AlertUtils.showAlert(
                INFORMATION,
                "Project documentation",
                null,
                "Project documentation successfully generated!");
    }

    private <T extends Executable> String generateDocumentation(T executable) {
        Parameter[] parameters = executable.getParameters();
        StringBuilder methodParameters = new StringBuilder();

        for (int i = 0; i < parameters.length; i++) {
            String modifierString = Modifier.toString(parameters[i].getModifiers());

            if (!modifierString.isEmpty()) {
                methodParameters.append(modifierString);
                methodParameters.append(" ");
            }

            methodParameters.append(parameters[i].getType().getSimpleName());
            methodParameters.append(" ");
            methodParameters.append(parameters[i].getName());

            if (i < (parameters.length - 1)) {
                methodParameters.append(", ");
            }
        }

        return methodParameters.toString();
    }

    public void saveGame() throws IOException {
        List<SerializableButton> serializableButtonList = new ArrayList<>();

        for (int i = 0; i < GAME_BOARD_WIDTH; i++) {
            for (int j = 0; j < GAME_BOARD_HEIGHT; j++) {
                serializableButtonList.add(new SerializableButton(i, j, gameBoard[i][j].getText()));
            }
        }

        try(ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream(SAVED_GAME_FILE))) {
            serializer.writeObject(serializableButtonList);
            serializer.writeObject(new ArrayList<String>(playerMovesObservable));
            serializer.writeBoolean(playerOneTurn);
            serializer.writeInt(turnCounter);
            serializer.writeInt(playerOneWalls);
            serializer.writeInt(playerTwoWalls);
            serializer.writeInt(LogInScreenController.getPlayerOneDetails().getNumberOfWins());
            serializer.writeInt(LogInScreenController.getPlayerTwoDetails().getNumberOfWins());
            serializer.writeUTF(LogInScreenController.getPlayerOneDetails().getPlayerName());
            serializer.writeUTF(LogInScreenController.getPlayerTwoDetails().getPlayerName());
        }

        AlertUtils.showAlert(
                INFORMATION,
                "Save game",
                null,
                "Game successfully saved!");
    }

    public void loadGame() throws IOException, ClassNotFoundException {
        try(ObjectInputStream deserializer = new ObjectInputStream(new FileInputStream(SAVED_GAME_FILE))) {
            List<SerializableButton> serializableButtonList = (List<SerializableButton>)deserializer.readObject();

            for (SerializableButton serializableButton : serializableButtonList) {
                gameBoard[serializableButton.positionX()][serializableButton.positionY()].setText(serializableButton.string());

                if (gameBoard[serializableButton.positionX()][serializableButton.positionY()].getText().equals(WHITE_PAWN)) {
                    playerOnePosition = gameBoard[serializableButton.positionX()][serializableButton.positionY()];
                    playerOnePreviousPosition = gameBoard[serializableButton.positionX()][serializableButton.positionY()];
                }
                else if (gameBoard[serializableButton.positionX()][serializableButton.positionY()].getText().equals(BLACK_PAWN)) {
                    playerTwoPosition = gameBoard[serializableButton.positionX()][serializableButton.positionY()];
                    playerTwoPreviousPosition = gameBoard[serializableButton.positionX()][serializableButton.positionY()];
                }
            }

            playerMovesObservable.setAll((List<String>)deserializer.readObject());
            playerOneTurn = deserializer.readBoolean();
            turnCounter = deserializer.readInt();
            playerOneWalls = deserializer.readInt();
            playerTwoWalls = deserializer.readInt();
            LogInScreenController.getPlayerOneDetails().setNumberOfWins(deserializer.readInt());
            LogInScreenController.getPlayerTwoDetails().setNumberOfWins(deserializer.readInt());
            LogInScreenController.getPlayerOneDetails().setPlayerName(deserializer.readUTF());
            LogInScreenController.getPlayerTwoDetails().setPlayerName(deserializer.readUTF());

            turn_counter.setText(String.valueOf(turnCounter));
            player_one_score.setText(String.valueOf(LogInScreenController.getPlayerOneDetails().getNumberOfWins()));
            player_two_score.setText(String.valueOf(LogInScreenController.getPlayerTwoDetails().getNumberOfWins()));
            player_one_name.setText(LogInScreenController.getPlayerOneDetails().getPlayerName());
            player_two_name.setText(LogInScreenController.getPlayerTwoDetails().getPlayerName());
            player_one_walls.setText(String.valueOf(playerOneWalls));
            player_two_walls.setText(String.valueOf(playerTwoWalls));
            player_moves.setItems(playerMovesObservable);
            player_moves.scrollTo(player_moves.getItems().size());

            if (playerOneTurn) {
                player_turn_name.setText(LogInScreenController.getPlayerOneDetails().getPlayerName());
            }
            else {
                player_turn_name.setText(LogInScreenController.getPlayerTwoDetails().getPlayerName());
            }
        }
    }

    public void exitGame() {
        Platform.exit();
    }

    public void about() {
        AlertUtils.showAlert(
                INFORMATION,
                "About",
                "Quoridor",
                "Made by Jan Šantek, 3RP1");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerOneTurn = true;
        player_turn_name.setText(LogInScreenController.getPlayerOneDetails().getPlayerName());
        wallButtonPlacementCounter = 0;
        playerOneWalls = 6;
        playerTwoWalls = 6;
        turnCounter = 0;

        turn_counter.setText(String.valueOf(turnCounter));
        player_one_score.setText(String.valueOf(LogInScreenController.getPlayerOneDetails().getNumberOfWins()));
        player_two_score.setText(String.valueOf(LogInScreenController.getPlayerTwoDetails().getNumberOfWins()));
        player_one_name.setText(LogInScreenController.getPlayerOneDetails().getPlayerName());
        player_two_name.setText(LogInScreenController.getPlayerTwoDetails().getPlayerName());
        player_one_walls.setText(String.valueOf(playerOneWalls));
        player_two_walls.setText(String.valueOf(playerTwoWalls));

        gameBoard = new Button[GAME_BOARD_WIDTH][GAME_BOARD_HEIGHT];

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

        playerOnePosition = gameBoard[10][5];
        playerTwoPosition = gameBoard[0][5];

        playerOnePreviousPosition = gameBoard[10][5];
        playerTwoPreviousPosition = gameBoard[0][5];

        gameBoard[10][5].setText(WHITE_PAWN);
        gameBoard[0][5].setText(BLACK_PAWN);
    }

    public void startTwoPlayerGame() throws IOException {
        FXMLUtils.showScreen(
                "gameScreen.fxml",
                QuoridorApplication.getMainStage(),
                1050,
                690);
    }
}
