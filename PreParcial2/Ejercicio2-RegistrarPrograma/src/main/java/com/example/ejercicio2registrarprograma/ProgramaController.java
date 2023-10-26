package com.example.ejercicio2registrarprograma;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProgramaController {

    @FXML
    private ComboBox<String> cbModalidad;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private void initialize() throws IOException {
        llenarCombox();
    }

    private void llenarCombox() throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("Ejercicio2-RegistrarPrograma//src//main//resources//Modalidad.properties"));
        for(Object contenido: properties.keySet()){
            cbModalidad.getItems().add(properties.getProperty((String)contenido));
        }
    }

    @FXML
    void agregar(ActionEvent event) {
        Programa programa=new Programa(txtCodigo.getText(),txtNombre.getText(),cbModalidad.getValue());
        Persistencia.guardarProgramaXml(programa);
    }

}
