package com.example.demo;
import javafx.fxml.FXML;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Testcontroller extends ControllerBase{

    @FXML
    private AnchorPane anchorPane;
    @FXML
    protected void onS() throws IOException {
        a.setStage((Stage) anchorPane.getScene().getWindow(),null,"hello-view.fxml",false);
    }

}
