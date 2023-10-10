package com.example.demo;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

import java.io.IOException;

public class HelloController extends ControllerBase{


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
    protected void addClick() {
                int r=Integer.parseInt(label_h.getText())+1;
                label_h.setText(String.valueOf(r));
    }
}