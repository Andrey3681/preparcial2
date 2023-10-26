module com.example.ejercicio2registrarprograma {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.ejercicio2registrarprograma to javafx.fxml;
    exports com.example.ejercicio2registrarprograma;
}