module com.example.plantillahilos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.plantillahilos to javafx.fxml;
    exports com.example.plantillahilos;
    exports com.example.plantillahilos.hilos;
    opens com.example.plantillahilos.hilos to javafx.fxml;
}