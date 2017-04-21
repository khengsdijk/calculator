/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author Koen Hengsdijk
 */
public class Calculator extends Application {
    
    private final static int SCENE_WIDTH = 300;
    private final static int SCENE_HEIGHT = 400;
    private Stage stage;
    
    @Override
    public void start(Stage primaryStage) {
        
        
        CalculatorGui calculatorgui = new CalculatorGui();
        
        
        
        
        Scene scene = new Scene(calculatorgui, 720, 500);
        scene.getStylesheets().add("resources/style.css");
    
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
