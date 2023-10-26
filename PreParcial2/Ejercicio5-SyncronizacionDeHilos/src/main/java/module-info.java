module com.example.ejercicio5syncronizaciondehilos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio5syncronizaciondehilos to javafx.fxml;
    exports com.example.ejercicio5syncronizaciondehilos;
}