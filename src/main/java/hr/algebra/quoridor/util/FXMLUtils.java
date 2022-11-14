package hr.algebra.quoridor.util;

import hr.algebra.quoridor.QuoridorApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLUtils {
    public static void showScreen(String fxmlFile, Stage stage, double sceneWidth, double sceneHeight) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(QuoridorApplication.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load(), sceneWidth, sceneHeight);
        stage.setTitle("Quoridor");
        stage.setScene(scene);
        stage.show();
    }
}
