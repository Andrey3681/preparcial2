module com.example.plantillamodelfactory {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mapstruct;
    requires java.desktop;
    requires java.logging;


    opens com.example.plantillamodelfactory to javafx.fxml;
    exports com.example.plantillamodelfactory;
    opens com.example.plantillamodelfactory.viewController;
    exports com.example.plantillamodelfactory.mapping.dto;
    exports com.example.plantillamodelfactory.mapping.mappers;
    exports com.example.plantillamodelfactory.controller;
    exports com.example.plantillamodelfactory.model;
    exports com.example.plantillamodelfactory.utils;
    exports com.example.plantillamodelfactory.exceptions;
    opens com.example.plantillamodelfactory.controller to javafx.fxml;
    exports com.example.plantillamodelfactory.viewController;

}