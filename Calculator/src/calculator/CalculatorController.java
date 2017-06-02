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
    private int Result;
    
    public CalculatorController() {
    }
    Operation operation;
    public enum Operation{
        ADD,
        SUBSTRACT,
        DIVIDE,
        MULTIPLY,
        REMAINDER
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
    
    public static void equalsFunction(TextField field, Operation operation,
            String buttonpressed){
            
        switch (operation){
            case ADD:
                
                break;
                
            case SUBSTRACT:
                
                break;
                
            case DIVIDE:
                
                break;
                
            case MULTIPLY:
                
                break;
                
            case REMAINDER:
                
                break;
            
        }
    }
    
}
