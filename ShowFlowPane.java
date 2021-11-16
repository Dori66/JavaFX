package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Create a pane and set its properties
        FlowPane flowPane = new FlowPane();//Saves the nodes in Horizontal way
        flowPane.setPadding(new Insets(11,12,13,14));
        flowPane.setHgap(5);//Distanca ne mes te nodes horizontalisht
        flowPane.setVgap(5);//Distanca ne mes te nodes vertikalisth

        //Place nodes in the pane
        flowPane.getChildren().addAll(new Label("First Name: "),new TextField(),new Label("MI: "));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(5);
        flowPane.getChildren().addAll(tfMi, new Label("Last Name: "), new TextField());

        //Create a scene and place it in the stage

        Scene scene = new Scene(flowPane,200,250);
        stage.setScene(scene);

        stage.show();

    }
}
