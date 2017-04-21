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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Koen Hengsdijk
 */
public class CalculatorGui extends GridPane{
    
    private final int BUTTON_WIDTH = 60;
    private final int BUTTON_HEIGTH = 30;
    
    public CalculatorGui() {
        
        TextField results = new TextField();
        results.getStyleClass().add("result");
        results.setMinHeight(50);
        results.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        
        Button equalsButton = new Button();
        equalsButton.setText("=");
        equalsButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        equalsButton.getStyleClass().add("equalsButton");
        equalsButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button leftHookButton = new Button();
        leftHookButton.setText("(");
        leftHookButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        leftHookButton.getStyleClass().add("button1");
        leftHookButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button rightHookButton = new Button();
        rightHookButton.setText(")");
        rightHookButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        rightHookButton.getStyleClass().add("button1");
        rightHookButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        Button percentageButton = new Button();
        percentageButton.setText("%");
        percentageButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        percentageButton.getStyleClass().add("button1");
        percentageButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
         Button acButton = new Button();
        acButton.setText("AC");
        acButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        acButton.getStyleClass().add("acButton");
        acButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
       
        
        Button sevenButton = new Button();
        sevenButton.setText("7");
        sevenButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        sevenButton.getStyleClass().add("button1");
        sevenButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button eightButton = new Button();
        eightButton.setText("8");
        eightButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        eightButton.getStyleClass().add("button1");
        eightButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button nineButton = new Button();
        nineButton.setText("9");
        nineButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        nineButton.getStyleClass().add("button1");
        nineButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        Button divideButton = new Button();
        divideButton.setText("\u00F7");
        divideButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        divideButton.getStyleClass().add("button1");
        divideButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button fourButton = new Button();
        fourButton.setText("4");
        fourButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        fourButton.getStyleClass().add("button1");
        fourButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button fiveButton = new Button();
        fiveButton.setText("5");
        fiveButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        fiveButton.getStyleClass().add("button1");
        fiveButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        Button sixButton = new Button();
        sixButton.setText("6");
        sixButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        sixButton.getStyleClass().add("button1");
        sixButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button multiplyButton = new Button();
        multiplyButton.setText("\u00F7");
        multiplyButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        multiplyButton.getStyleClass().add("button1");
        multiplyButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button oneButton = new Button();
        oneButton.setText("1");
        oneButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        oneButton.getStyleClass().add("button1");
        oneButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
         Button twoButton = new Button();
        twoButton.setText("2");
        twoButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        twoButton.getStyleClass().add("button1");
        twoButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
         Button threeButton = new Button();
        threeButton.setText("3");
        threeButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        threeButton.getStyleClass().add("button1");
        threeButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
         Button plusButton = new Button();
        plusButton.setText("+");
        plusButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        plusButton.getStyleClass().add("button1");
        plusButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
         Button zeroButton = new Button();
        zeroButton.setText("0");
        zeroButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        zeroButton.getStyleClass().add("button1");
        zeroButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
         Button dotButton = new Button();
        dotButton.setText(".");
        dotButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        dotButton.getStyleClass().add("button1");
        dotButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               
                System.out.println("Hello World!");
                
            }
        });
        Button minusButton = new Button();
        minusButton.setText("-");
        minusButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGTH);
        minusButton.getStyleClass().add("button1");
        minusButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        
        
        this.getStyleClass().add("pane");
        this.setHgap(15);
        this.setVgap(15);
        this.setPadding(new Insets(10, 10, 10, 10));
        this.add(results, 0, 0, 4, 1);
        this.add(leftHookButton, 0, 2);
        this.add(rightHookButton, 1, 2);
        this.add(percentageButton, 2, 2);
        this.add(acButton, 3, 2);
        this.add(sevenButton, 0, 3);
        this.add(eightButton, 1, 3);
        this.add(nineButton, 2, 3);
         this.add(divideButton, 3, 3);
        this.add(fourButton, 0, 4);
        this.add(fiveButton, 1, 4);
        this.add(sixButton, 2, 4);
        this.add(multiplyButton, 3, 4);
        this.add(oneButton, 0, 5);
        this.add(twoButton, 1, 5);
        this.add(threeButton, 2, 5);
        this.add(plusButton, 3, 5);
        this.add(zeroButton, 0, 6);
        this.add(dotButton, 1, 6);
        this.add(equalsButton, 2, 6);
        this.add(minusButton, 3, 6);
    }
    
  
        
}
