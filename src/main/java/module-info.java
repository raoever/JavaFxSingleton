module com.example.javafxsingleton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsingleton to javafx.fxml;
    exports com.example.javafxsingleton;
}