package Facade;

import javafx.scene.control.Button;

/**
 * @author Jafet
 */
public class RedButt {
    /**
     * @return Button: This method return a red button
     */
    public Button Generate(){
        Button button=new Button("This is the Red Button");
        button.setStyle("-fx-background-color:#ff3408");
        return button;
    }
}
