package Facade;

import javafx.scene.control.Button;

public class GreenButt {
    public Button Generate(){
        Button button=new Button("This is the Green Button");
        button.setStyle("-fx-background-color:#25ff04");
        return button;
    }
}
