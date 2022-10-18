module hr.algebra.quoridor {
    requires javafx.controls;
    requires javafx.fxml;


    opens hr.algebra.quoridor to javafx.fxml;
    exports hr.algebra.quoridor;
}