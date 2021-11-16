package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle();
        circle.setCenterY(100);
        circle.setCenterX(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.RED);

        Pane stackPane = new Pane();
        stackPane.getChildren().add(circle);

        Scene scene = new Scene(stackPane,200,200);

        stage.setScene(scene);

        stage.show();
    }
}
