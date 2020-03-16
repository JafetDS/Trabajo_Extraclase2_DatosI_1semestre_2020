package Facade;

import javafx.scene.control.Button;
/**
 * @author Jafet
 */
public class BlueButt {
    /**
     * @return Button: This method return a Blue button
     */
    public Button Generate(){
        Button button=new Button("This is the Blue Button");
        button.setStyle("-fx-background-color:#217aff");
        return button;
    }
}
