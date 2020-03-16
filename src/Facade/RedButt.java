package Facade;

import javafx.scene.control.Button;

public class RedButt {
    public Button Generate(){
        Button button=new Button("This is the Red Button");
        button.setStyle("-fx-background-color:#ff3408");
        return button;
    }
}
