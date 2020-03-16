package Facade;

import javafx.scene.layout.HBox;
/**
 * @author Jafet
 * @classDescription This class put a controls grapic objec (Buttons) in a container grapic objec (HBox)
 */

public class Generator {
    private RedButt redButt;
    private BlueButt blueButt;
    private GreenButt greenButt;

    public Generator(){
        redButt=new RedButt();
        blueButt=new BlueButt();
        greenButt=new GreenButt();
    }

    /**
     * @param hbox : container where the button comes in.
     * @description this method put a red button  in a hbox.
     */
    public void addRedButton(HBox hbox){
        hbox.getChildren().add(redButt.Generate());
    }
    /**
     * @param hbox : container where the button comes in.
     * @description this method put a blue button  in a hbox.
     */
    public void addBlueButton(HBox hbox){
        hbox.getChildren().add(blueButt.Generate());
    }
    /**
     * @param hbox : container where the button comes in.
     * @description this method put a green button  in a hbox
     */
    public void addGreenButton(HBox hbox){
        hbox.getChildren().add(greenButt.Generate());
    }






}




