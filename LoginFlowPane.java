package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LoginFlowPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FlowPane pane = new FlowPane();
        Orientation horizontal = Orientation.VERTICAL;
        pane.setOrientation(horizontal);

        Label name = new Label("First Name: ");
        TextField nameField = new TextField();
        Label lastName = new Label("Last Name");
        TextField lastNameField = new TextField();
        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-color:red;");


        pane.getChildren().addAll(name,nameField,lastName,lastNameField,submitButton);

        Scene scene = new Scene(pane);

        stage.setScene(scene);

        stage.show();
    }
}
