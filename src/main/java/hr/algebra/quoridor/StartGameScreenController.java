package hr.algebra.quoridor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartGameScreenController implements Initializable {

    @FXML
    private RadioButton twoPlayerRadioButton;

    @FXML
    private RadioButton fourPlayerRadioButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup radioButtonGroup = new ToggleGroup();
        twoPlayerRadioButton.setToggleGroup(radioButtonGroup);
        fourPlayerRadioButton.setToggleGroup(radioButtonGroup);
    }

    public void startGame() {
        FXMLLoader fxmlLoader = null;

        if (twoPlayerRadioButton.isSelected()) {
            fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("twoPlayerStartGameScreen.fxml"));
        }
        else {
            fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource("fourPlayerStartGameScreen.fxml"));
        }

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