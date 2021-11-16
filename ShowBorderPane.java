package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.CustomTextField;

public class ShowBorderPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();//Can place node in 5 directions: T,B,L,R,C


        //Place the nodes
        borderPane.setTop(new CustomTextField());
        borderPane.setRight(new CustomTextField());
        borderPane.setBottom(new CustomTextField());
        borderPane.setLeft(new CustomTextField());
        borderPane.setCenter(new CustomTextField());

        //Create Scene

        Scene scene = new Scene(borderPane);

        stage.setScene(scene);

        stage.show();

    }
}
