package Facade;

import javafx.scene.layout.HBox;

public class Generator {
    private RedButt redButt;
    private BlueButt blueButt;
    private GreenButt greenButt;

    public Generator(){
        redButt=new RedButt();
        blueButt=new BlueButt();
        greenButt=new GreenButt();
    }

    public void addRedButton(HBox hbox){
        hbox.getChildren().add(redButt.Generate());
    }


    public void addBlueButton(HBox hbox){
        hbox.getChildren().add(blueButt.Generate());
    }


    public void addGreenButton(HBox hbox){
        hbox.getChildren().add(greenButt.Generate());
    }






}




