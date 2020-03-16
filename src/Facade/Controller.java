package Facade;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import javafx.event.ActionEvent;
import java.util.ResourceBundle;

import java.net.URL;

public class Controller implements Initializable,Runnable{
    private Generator generator;
    @FXML
    private HBox hbox;

    @FXML
    public void CreateRedButton(ActionEvent e){
        generator.addRedButton(hbox);
    }
    @FXML
    public void CreateBlueButton(ActionEvent e){
        generator.addBlueButton(hbox);

    }
    @FXML
    public void CreateGreenButton(ActionEvent e){
        generator.addGreenButton(hbox);

    }

    @Override
    public void run() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        generator=new Generator();


    }


}
