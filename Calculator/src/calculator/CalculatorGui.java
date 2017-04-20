/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Koen Hengsdijk
 */
public class CalculatorGui extends GridPane{

    public CalculatorGui() {
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.getStyleClass().add("button1");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
    }
        
}
