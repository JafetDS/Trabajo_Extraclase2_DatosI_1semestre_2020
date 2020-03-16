package Facade;

import javafx.scene.control.Button;
/**
 * @author Jafet
 */
public class GreenButt {
    /**
     * @return Button: This method return a Green button
     */
    public Button Generate(){
        Button button=new Button("This is the Green Button");
        button.setStyle("-fx-background-color:#25ff04");
        return button;
    }
}
