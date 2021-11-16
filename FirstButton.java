package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FirstButton extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button("Click Me");
        btn.setStyle("-fx-color:red;");
        Scene scene = new Scene(btn);
        stage.setTitle("firstButton");
        stage.setScene(scene);

        stage.show();
    }
}
