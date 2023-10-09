package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label label_h;
    @FXML
    protected void onHelloButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("test.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
        Stage stage= (Stage) anchorPane.getScene().getWindow();
        Scene scena=(Scene) anchorPane.getScene();
        stage.setScene(scene);
        stage.show();
        //stage.setScene(scena);


    }
    @FXML
    protected void addClick() throws IOException {
                int r=Integer.parseInt(label_h.getText())+1;
                label_h.setText(String.valueOf(r));
    }
}