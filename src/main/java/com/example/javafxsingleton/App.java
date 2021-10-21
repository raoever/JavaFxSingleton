package com.example.javafxsingleton;

import com.example.javafxsingleton.view.MainScene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        var label = new Label("Hello JavaFX");
        var scene = new MainScene(this);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void setScene (Scene scene){
        stage.setScene(scene);
    }
}