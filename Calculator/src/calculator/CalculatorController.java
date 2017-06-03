/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;

import javafx.scene.control.TextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author koen hengsdijk
 */
public class CalculatorController {
    
    private ArrayList<Integer> numberPressed = new ArrayList();
    
    private int firstNumber;
    private int secondNumber;
    private int Result;
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
    
    public static void equalsFunction(TextField field, String equation){
         ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");
    String foo = equation;
        try {
            field.setText(engine.eval(foo).toString());
        } catch (ScriptException ex) {
            field.setText("Syntax error");
            System.out.println(ex);
        }
    }
    
    public void operationFunction(TextField field, Operation operation, 
            boolean equalsButton){
            
        switch (operation){
            case ADD:
                lastOperation = Operation.ADD;
                if(!firstNumberEntered && equalsButton){
                firstNumber = Integer.parseInt(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Integer.parseInt(field.getText());
                    Result = firstNumber + secondNumber;
                    field.clear();
                    field.setText(Integer.toString(Result));
                    firstNumberEntered = false;
                }
                
                break;
                
            case SUBSTRACT:
                
                lastOperation = Operation.SUBSTRACT;
                if(!firstNumberEntered && equalsButton){
                firstNumber = Integer.parseInt(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Integer.parseInt(field.getText());
                    Result = firstNumber - secondNumber;
                    field.clear();
                    field.setText(Integer.toString(Result));
                    firstNumberEntered = false;
                }
                
                
                break;
                
            case DIVIDE:
                
                lastOperation = Operation.DIVIDE; 
                if(!firstNumberEntered && equalsButton){
                firstNumber = Integer.parseInt(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Integer.parseInt(field.getText());
                    Result = firstNumber / secondNumber;
                    field.clear();
                    field.setText(Integer.toString(Result));
                    firstNumberEntered = false;
                }
                
                
                break;
                
            case MULTIPLY:
                
                lastOperation = Operation.MULTIPLY;
                if(!firstNumberEntered && equalsButton){
                firstNumber = Integer.parseInt(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Integer.parseInt(field.getText());
                    Result = firstNumber * secondNumber;
                    field.clear();
                    field.setText(Integer.toString(Result));
                    firstNumberEntered = false;
                }
                
                
                
                break;
                
            case REMAINDER:
                
                lastOperation = Operation.REMAINDER;
                if(!firstNumberEntered && equalsButton){
                firstNumber = Integer.parseInt(field.getText());
                
                field.clear();
                firstNumberEntered = true;
                } else{
                    secondNumber = Integer.parseInt(field.getText());
                    Result = firstNumber % secondNumber;
                    field.clear();
                    field.setText(Integer.toString(Result));
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
