package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Buttonv2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        Button button = new Button("Click Me");
        pane.getChildren().add(button);
//        pane.getChildren().add(new Button("Click Me Twice"));
        Scene scene = new Scene(pane,200,200);
        stage.setScene(scene);

        stage.show();
    }
}
