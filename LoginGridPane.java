package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginGridPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();


        Label name = new Label("First Name: ");
        TextField nameField = new TextField();
        Label lastName = new Label("Last Name");
        TextField lastNameField = new TextField();
        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-color:red;");

        pane.add(name,0,0);
        pane.add(lastName,1,0);
        pane.add(nameField,0,1);
        pane.add(lastNameField,1,1);
        pane.add(submitButton,2,2);
        pane.setPadding(new Insets(10,10,10,10));

        Scene scene = new Scene(pane);

        stage.setScene(scene);

        stage.show();


    }
}
