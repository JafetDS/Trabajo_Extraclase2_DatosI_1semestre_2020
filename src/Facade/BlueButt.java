package Facade;

import javafx.scene.control.Button;

public class BlueButt {
    public Button Generate(){
        Button button=new Button("This is the Blue Button");
        button.setStyle("-fx-background-color:#217aff");
        return button;
    }
}
