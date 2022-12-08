module one.digitalinnovation.listaencadeada {
    requires javafx.controls;
    requires javafx.fxml;


    opens one.digitalinnovation.listaencadeada to javafx.fxml;
    exports one.digitalinnovation.listaencadeada;
}