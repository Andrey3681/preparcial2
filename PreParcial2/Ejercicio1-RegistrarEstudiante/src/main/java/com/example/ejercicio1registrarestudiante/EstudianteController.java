package com.example.ejercicio1registrarestudiante;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EstudianteController {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNota1;

    @FXML
    private TextField txtNota2;

    @FXML
    private TextField txtNota3;

    @FXML
    void agregar(ActionEvent event) throws IOException {
        Estudiante estudiante=new Estudiante(txtCodigo.getText(),txtNombre.getText());
        estudiante.getNotas().add(Float.valueOf(txtNota1.getText()));
        estudiante.getNotas().add(Float.valueOf(txtNota2.getText()));
        estudiante.getNotas().add(Float.valueOf(txtNota3.getText()));
        Persistencia.guardarEstudiante(estudiante);
        Persistencia.registrarLog("se registro un estudiante","registrar",1);
    }

}

