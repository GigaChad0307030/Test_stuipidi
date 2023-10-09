package com.example.demo;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Testcontroller {
    Scene old;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    protected void onS() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
        Stage stage= (Stage) anchorPane.getScene().getWindow();
        Scene scena=(Scene) anchorPane.getScene();
        stage.setScene(scene);
        stage.show();
    }
}
