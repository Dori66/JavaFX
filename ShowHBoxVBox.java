package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        BorderPane pane = new BorderPane();

        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        Scene scene = new Scene(pane);
        stage.setScene(scene);

        stage.show();
    }


    private HBox getHBox(){
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        ImageView imageView = new ImageView(new Image("C:\\Users\\doran\\Desktop\\TestPhotos\\dogi.png"));
        hBox.getChildren().add(imageView);
        return hBox;
    }

    private VBox getVBox(){
        VBox  vBox = new VBox(15);
        vBox.setPadding(new Insets(15,5,5,5));
        vBox.getChildren().add(new Label("Courses"));

        Label [] courses = {new Label("CSI 13031"),new Label("CSI 1302"),new Label("CSI 2410"),new Label("CSI3720")};

        for (Label course : courses){
            VBox.setMargin(course,new Insets(0,0,0,15));
            vBox.getChildren().add(course);
        }
        return vBox;
    }
}
