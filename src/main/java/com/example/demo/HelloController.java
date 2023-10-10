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

public class HelloController extends ControllerBase{

    @FXML
    private Label welcomeText;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label label_h;
    @FXML
    protected void onHelloButtonClick() throws IOException {
        a.setStage((Stage) anchorPane.getScene().getWindow(),null,"test.fxml",false);
    }
    @FXML
    protected void newW() throws IOException {
        a.setStage((Stage) anchorPane.getScene().getWindow(),"hello-view.fxml","test.fxml",true);
    }
    @FXML
    protected void addClick() throws IOException {
                int r=Integer.parseInt(label_h.getText())+1;
                label_h.setText(String.valueOf(r));
    }
}