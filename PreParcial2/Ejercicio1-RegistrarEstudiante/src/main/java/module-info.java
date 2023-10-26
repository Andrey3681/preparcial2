module com.example.ejercicio1registrarestudiante {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.ejercicio1registrarestudiante to javafx.fxml;
    exports com.example.ejercicio1registrarestudiante;
}