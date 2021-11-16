package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.controlsfx.control.spreadsheet.Grid;

public class DisplayImages extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5,5,5,5));

        Image image = new Image("C:\\Users\\doran\\Desktop\\TestPhotos\\dogi.png");
        Image image1 = new Image("C:\\Users\\doran\\Desktop\\TestPhotos\\dogi2.png");
        Image image2 = new Image("C:\\Users\\doran\\Desktop\\TestPhotos\\dogi3.png");
        Image image3 = new Image("C:\\Users\\doran\\Desktop\\TestPhotos\\dogi4.png");
        ImageView imageView = new ImageView(image1);
        imageView.setFitWidth(250);
        imageView.setFitHeight(250);


        gridPane.add(new ImageView(image),0,0);
        gridPane.add(imageView,0,1);
        gridPane.add(new ImageView(image2),1,0);
        gridPane.add(new ImageView(image3),1,1);



        Scene scene = new Scene(gridPane);

        stage.setScene(scene);

        stage.show();
    }
}
