/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;
import javafx.scene.control.TextField;
/**
 *
 * @author koen hengsdijk
 */
public class CalculatorController {
    
    private ArrayList<Integer> numberPressed = new ArrayList();
    
    private double  firstNumber;
    private double secondNumber;
    private double Result;
    private boolean firstNumberEntered = false;
    private Operation lastOperation;
    
    public CalculatorController() {
    }
    Operation operation;
    public static enum Operation{
        ADD,
        SUBSTRACT,
        DIVIDE,
        MULTIPLY,
        REMAINDER,
        CLEAR,
        EQUALS
    }
    
    public static void acButtonAction(TextField textfield){
        
        textfield.clear();
    }
    
    public static void setResultText(TextField text, String ButtonPressed) {
        text.setText(text.getText() + ButtonPressed);
    }
    

    
    public void operationFunction(TextField field, Operation operation, 
            boolean equalsButton){
            
        switch (operation){
            case ADD:
                lastOperation = Operation.ADD;
                if(!firstNumberEntered && equalsButton){
                firstNumber = Double.parseDouble(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Double.parseDouble(field.getText());
                    Result = firstNumber + secondNumber;
                    field.clear();
                    field.setText(Double.toString(Result));
                    firstNumberEntered = false;
                }
                
                break;
                
            case SUBSTRACT:
                
                lastOperation = Operation.SUBSTRACT;
                if(!firstNumberEntered && equalsButton){
                firstNumber = Double.parseDouble(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Double.parseDouble(field.getText());
                    Result = firstNumber - secondNumber;
                    field.clear();
                    field.setText(Double.toString(Result));
                    firstNumberEntered = false;
                }
                
                
                break;
                
            case DIVIDE:
                
                lastOperation = Operation.DIVIDE; 
                if(!firstNumberEntered && equalsButton){
                firstNumber = Double.parseDouble(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Double.parseDouble(field.getText());
                    Result = firstNumber / secondNumber;
                    field.clear();
                    field.setText(Double.toString(Result));
                    firstNumberEntered = false;
                }
                
                
                break;
                
            case MULTIPLY:
                
                lastOperation = Operation.MULTIPLY;
                if(!firstNumberEntered && equalsButton){
                firstNumber = Double.parseDouble(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Double.parseDouble(field.getText());
                    Result = firstNumber * secondNumber;
                    field.clear();
                    field.setText(Double.toString(Result));
                    firstNumberEntered = false;
                }
                
                
                
                break;
                
            case REMAINDER:
                
                lastOperation = Operation.REMAINDER;
                if(!firstNumberEntered && equalsButton){
                firstNumber = Double.parseDouble(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Double.parseDouble(field.getText());
                    Result = firstNumber % secondNumber;
                    field.clear();
                    field.setText(Double.toString(Result));
                    firstNumberEntered = false;
                }
                
                
                
                break;
            
            case CLEAR:
                
                field.clear();
                firstNumberEntered = false;
                secondNumber = 0;
                firstNumber = 0;
                
                break;
                
            case EQUALS:
                operationFunction(field, lastOperation, false);
                
        }
    }
    
}
