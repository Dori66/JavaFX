package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotate extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();

        Button button = new Button("CLick Me");
        button.setStyle("-fx-border-color: blue; -fx-color:yellow;");
        stackPane.getChildren().add(button);

        stackPane.setRotate(45);
        stackPane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(stackPane,200,250);

        stage.setScene(scene);
        stage.show();


    }
}
