module com.example.examen {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;

    opens com.example to javafx.fxml, javafx.base;
    exports com.example.controller;
    opens com.example.controller to javafx.fxml, javafx.base;
    exports com.example;
    opens com.example.entitie to javafx.base; // Ouvrir le package à javafx.base

}