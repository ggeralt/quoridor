package hr.algebra.quoridor;

import hr.algebra.quoridor.model.SerializableButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
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
    private static final String CLASS_EXTENSION = ".class";
    private static int turnCounter;
    private static int wallButtonPlacementCounter;
    private static int playerOneWalls;
    private static int playerTwoWalls;
    private static int X_wall;
    private static int Y_wall;
    private boolean playerOneTurn;
    private Button playerOnePosition;
    private Button playerOnePreviousPosition;
    private Button playerTwoPosition;
    private Button playerTwoPreviousPosition;
    private Button pressedButton;
    private Button[][] gameBoard;
    private final Image whitePawn = new Image(Objects.requireNonNull(getClass().getResourceAsStream("image/white_pawn.png")));
    private final Image blackPawn = new Image(Objects.requireNonNull(getClass().getResourceAsStream("image/black_pawn.png")));
    private final Image wall = new Image(Objects.requireNonNull(getClass().getResourceAsStream("image/wall.png")));

    public void wallButtonPressed() {
        wallButtonPlacementCounter = 2;
    }

    public void buttonPressed(ActionEvent actionEvent) {
        pressedButton = (Button)actionEvent.getSource();

        if (pressedButton.getGraphic() != null || pressedButton == playerOnePosition || pressedButton == playerTwoPosition) {
            return;
        }

        if (playerOneTurn) {
            if (wallButtonPlacementCounter != 0 && playerOneWalls != 0 && checkInvalidWallPlacement()) {
                if (wallButtonPlacementCounter == 2) {
                    pressedButton.setGraphic(new ImageView(wall));
                    X_wall = Integer.parseInt(pressedButton.getId().split("_", 3)[1]);
                    Y_wall = Integer.parseInt(pressedButton.getId().split("_", 3)[2]);
                    wallButtonPlacementCounter--;
                    playerOneWalls--;
                }
                else {
                    if (Y_wall == 0) {
                        if (pressedButton == gameBoard[X_wall][Y_wall + 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            pressedButton.setGraphic(new ImageView(wall));
                            wallButtonPlacementCounter--;
                            playerOneWalls--;
                            turnCounter++;
                            playerOneTurn = false;
                        }
                    }
                    else if (Y_wall == 10) {
                        if (pressedButton == gameBoard[X_wall][Y_wall - 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            pressedButton.setGraphic(new ImageView(wall));
                            wallButtonPlacementCounter--;
                            playerOneWalls--;
                            turnCounter++;
                            playerOneTurn = false;
                        }
                    }
                    else {
                        if (pressedButton == gameBoard[X_wall][Y_wall + 1] || pressedButton == gameBoard[X_wall][Y_wall - 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            pressedButton.setGraphic(new ImageView(wall));
                            wallButtonPlacementCounter--;
                            playerOneWalls--;
                            turnCounter++;
                            playerOneTurn = false;
                        }
                    }
                }

                return;
            }

            int X1 = Integer.parseInt(playerOnePosition.getId().split("_", 3)[1]);
            int Y1 = Integer.parseInt(playerOnePosition.getId().split("_", 3)[2]);

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
        else {
            if (wallButtonPlacementCounter != 0 && playerTwoWalls != 0 && checkInvalidWallPlacement()) {
                if (wallButtonPlacementCounter == 2) {
                    pressedButton.setGraphic(new ImageView(wall));
                    X_wall = Integer.parseInt(pressedButton.getId().split("_", 3)[1]);
                    Y_wall = Integer.parseInt(pressedButton.getId().split("_", 3)[2]);
                    wallButtonPlacementCounter--;
                    playerTwoWalls--;
                }
                else {
                    if (Y_wall == 0) {
                        if (pressedButton == gameBoard[X_wall][Y_wall + 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            pressedButton.setGraphic(new ImageView(wall));
                            wallButtonPlacementCounter--;
                            playerTwoWalls--;
                            turnCounter++;
                            playerOneTurn = true;
                        }
                    }
                    else if (Y_wall == 10) {
                        if (pressedButton == gameBoard[X_wall][Y_wall - 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            pressedButton.setGraphic(new ImageView(wall));
                            wallButtonPlacementCounter--;
                            playerTwoWalls--;
                            turnCounter++;
                            playerOneTurn = true;
                        }
                    }
                    else {
                        if (pressedButton == gameBoard[X_wall][Y_wall + 1] || pressedButton == gameBoard[X_wall][Y_wall - 1] || pressedButton == gameBoard[X_wall + 1][Y_wall] || pressedButton == gameBoard[X_wall - 1][Y_wall]) {
                            pressedButton.setGraphic(new ImageView(wall));
                            wallButtonPlacementCounter--;
                            playerTwoWalls--;
                            turnCounter++;
                            playerOneTurn = true;
                        }
                    }
                }

                return;
            }

            int X2 = Integer.parseInt(playerTwoPosition.getId().split("_", 3)[1]);
            int Y2 = Integer.parseInt(playerTwoPosition.getId().split("_", 3)[2]);

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

    private boolean checkInvalidWallPlacement() {
        return pressedButton != button_0_0 && pressedButton != button_0_1 && pressedButton != button_0_2 && pressedButton != button_0_3 && pressedButton != button_0_4 &&
               pressedButton != button_0_5 && pressedButton != button_0_6 && pressedButton != button_0_7 && pressedButton != button_0_8 && pressedButton != button_0_9 &&
               pressedButton != button_0_10 && pressedButton != button_10_0 && pressedButton != button_10_1 && pressedButton != button_10_2 && pressedButton != button_10_3 &&
               pressedButton != button_10_4 && pressedButton != button_10_5 && pressedButton != button_10_6 && pressedButton != button_10_7 && pressedButton != button_10_8 &&
               pressedButton != button_10_9 && pressedButton != button_10_10;
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

        try {
            startTwoPlayerGame();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void applyPlayerInput() {
        if (playerOneTurn) {
            pressedButton.setGraphic(new ImageView(whitePawn));
            playerOnePosition = pressedButton;
            playerOnePreviousPosition.setGraphic(null);
            playerOnePreviousPosition = playerOnePosition;
            playerOneTurn = false;
        }
        else {
            pressedButton.setGraphic(new ImageView(blackPawn));
            playerTwoPosition = pressedButton;
            playerTwoPreviousPosition.setGraphic(null);
            playerTwoPreviousPosition = playerTwoPosition;
            playerOneTurn = true;
        }

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
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("generateDocumentation() ERROR");
            alert.setHeaderText("Cannot find the files.");
            alert.setContentText("The class files cannot be accessed.");
        }

        System.out.println("Project documentation successfully generated!");
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

    // TODO: replace walls and pawns with strings so that the game can be serialized
    public void saveGame() throws IOException {
        List<SerializableButton> serializableButtonList = new ArrayList<>();

        for (int i = 0; i < GAME_BOARD_WIDTH; i++) {
            for (int j = 0; j < GAME_BOARD_HEIGHT; j++) {
                serializableButtonList.add(new SerializableButton(i, j, (ImageView)gameBoard[i][j].getGraphic()));
            }
        }

        try(ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream("savedGame.ser"))) {
            serializer.writeObject(serializableButtonList);
        }
    }

    public void loadGame() throws IOException, ClassNotFoundException {
        try(ObjectInputStream deserializer = new ObjectInputStream(new FileInputStream("savedGame.ser"))) {
            List<SerializableButton> serializableButtonList = (List<SerializableButton>)deserializer.readObject();

            for (SerializableButton serializableButton : serializableButtonList) {
                gameBoard[serializableButton.getPositionX()][serializableButton.getPositionY()].setGraphic(serializableButton.getImageView());
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerOneTurn = true;
        wallButtonPlacementCounter = 0;
        playerOneWalls = 8;
        playerTwoWalls = 8;
        turnCounter = 0;

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

        playerOnePosition = button_10_5;
        playerTwoPosition = button_0_5;

        button_0_5.setGraphic(new ImageView(blackPawn));
        button_10_5.setGraphic(new ImageView(whitePawn));

        playerOnePreviousPosition = playerOnePosition;
        playerTwoPreviousPosition = playerTwoPosition;
    }

    public void startTwoPlayerGame() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("twoPlayerGameScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1154, 690);
        Stage stage = QuoridorApplication.getMainStage();

        stage.setTitle("Quoridor");
        stage.setScene(scene);
        stage.show();
    }
}
