module com.example.examen {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;


    opens com.example.examen to javafx.fxml;
    exports com.example.examen;
}