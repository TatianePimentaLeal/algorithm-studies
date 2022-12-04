module one.digitalinnovation.pilha {
    requires javafx.controls;
    requires javafx.fxml;


    opens one.digitalinnovation.pilha to javafx.fxml;
    exports one.digitalinnovation.pilha;
}