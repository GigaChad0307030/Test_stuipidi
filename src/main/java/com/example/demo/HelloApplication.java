package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        SwitchController a=new SwitchController();
        Scene scene= a.setStage(stage, null, "hello-view.fxml", false);

    }

    public static void main(String[] args) {
        launch();
    }
}