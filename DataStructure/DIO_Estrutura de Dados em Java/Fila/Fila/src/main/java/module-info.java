module one.digitalinnovation.fila {
    requires javafx.controls;
    requires javafx.fxml;


    opens one.digitalinnovation.fila to javafx.fxml;
    exports one.digitalinnovation.fila;
}