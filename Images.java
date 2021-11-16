package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Images extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("C:\\Users\\doran\\Desktop\\TestPhotos\\dogi.png");
        pane.getChildren().add(new ImageView(image));

        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        pane.getChildren().add(imageView);

        ImageView imageView1 = new ImageView(image);
        imageView1.setRotate(70);
        pane.getChildren().add(imageView1);

        Scene scene = new Scene(pane);

        stage.setScene(scene);

        stage.show();



    }
}
