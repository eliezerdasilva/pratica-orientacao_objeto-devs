package com.example.ravin.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaManterCliente extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws IOException {
    	//Implemetar os arraylist do combobox 
    	
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/ravin/TelaManterCliente.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
