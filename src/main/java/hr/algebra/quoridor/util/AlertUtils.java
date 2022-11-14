package hr.algebra.quoridor.util;

import hr.algebra.quoridor.QuoridorApplication;
import javafx.scene.control.Alert;

public class AlertUtils {
    public static void showAlert(Alert.AlertType type, String title, String headerText, String contentText) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.initOwner(QuoridorApplication.getMainStage());
        alert.showAndWait();
    }
}
