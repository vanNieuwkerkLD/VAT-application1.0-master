package com.proftaak.VAT;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("views/Mainwindow.fxml"));
        primaryStage.setTitle("VAT Application");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();

    }

    @Override
    public void stop() {
    }

    @Override
    public void init() {
    }
}

