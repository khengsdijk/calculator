/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Koen Hengsdijk
 */
public class CalculatorGui extends GridPane{

    public CalculatorGui() {
        
        TextField results = new TextField();
        
        
        Button equalsButton = new Button();
        equalsButton.setText("=");
        equalsButton.getStyleClass().add("button1");
        equalsButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        
        
        
        
        this.getStyleClass().add("pane");
        this.setHgap(15);
        this.setVgap(15);
        this.setPadding(new Insets(10, 10, 10, 10));
        this.add(equalsButton, 0, 4);
        this.add(results, 0, 0, 1, 4);
    }
    
  
        
}
