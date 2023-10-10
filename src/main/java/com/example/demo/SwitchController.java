package com.example.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class SwitchController {
    HashMap<String, Scene> scenes;
    int x,y;
    SwitchController(){
        x=1000;
        y=800;
        scenes=new HashMap<String,Scene>();
    }
    public Scene setStage(Stage stage,String fromscene,String toscene,boolean closing) throws IOException {
        if(fromscene!=null){
            if(closing){
                scenes.remove(fromscene);
            }
        }
        Scene scena=scenes.get(toscene);
        if(scena==null){
            FXMLLoader fxmlLoader = new FXMLLoader(SwitchController.class.getResource(toscene));
            Parent load = fxmlLoader.load();
            fxmlLoader.<ControllerBase>getController().setA(this);
            scena = new Scene(load, x, y);
            scenes.put(toscene,scena);
        }
        stage.setScene(scena);
        stage.show();
        return scena;
    }

}
