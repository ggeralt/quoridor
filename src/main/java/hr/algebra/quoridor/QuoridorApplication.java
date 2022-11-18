package hr.algebra.quoridor;

import hr.algebra.quoridor.util.FXMLUtils;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class QuoridorApplication extends Application {
    private static Stage mainStage;

    public static Stage getMainStage() {
        return mainStage;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLUtils.showScreen(
                "logInScreen.fxml",
                stage,
                600,
                400);

        mainStage = stage;
    }

    public static void main(String[] args) {
        launch();
    }
}