package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new StackPane();

        Circle circle = new Circle();

        circle.setRadius(50);
        circle.setStroke(Color.RED);
        circle.setFill(new Color(0.5,0.5,0.5,0.1));
        pane.getChildren().add(circle);


        Label label = new Label("Java Fx");
        label.setFont(Font.font("Times new Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
        pane.getChildren().add(label);

        Scene scene = new Scene(pane,200,200);
        stage.setScene(scene);

        stage.show();
    }
}
