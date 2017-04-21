/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.scene.control.TextField;

/**
 *
 * @author koen hengsdijk
 */
public class CalculatorController {
    
    

    public CalculatorController() {
    }
    
    public static void acButtonAction(TextField textfield){
        
        textfield.clear();
    }
    
    public static void setResultText(TextField text, String ButtonPressed) {
        text.setText(text.getText() + ButtonPressed);
    }
    
    
    
}
