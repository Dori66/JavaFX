package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        Image xImage = new Image("C:\\Users\\doran\\Desktop\\TestPhotos\\x.png");
        Image oImage = new Image("C:\\Users\\doran\\Desktop\\TestPhotos\\o.png");
        ImageView imageViewX = new ImageView(xImage);
        ImageView imageViewO = new ImageView(oImage);

        pane.add(imageViewO,0,0);
//        pane.add(imageViewO,0,1);
//        pane.add(imageViewO,0,2);
        pane.add(imageViewX,1,0);
//        pane.add(imageViewX,1,2);
//        pane.add(imageViewX,2,0);
        pane.setStyle("-fx-background-color:yellow;");

        pane.setPadding(new Insets(5,5,5,5));
        pane.setVgap(5);
        pane.setHgap(5);

        Scene scene = new Scene(pane);
        scene.setFill(Color.BLUE);
        stage.setScene(scene);

        stage.show();
    }
}
