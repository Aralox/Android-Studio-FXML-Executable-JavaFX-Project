package com.example;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Bar extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException {
//        String s = getClass().getName();
//        int i = s.lastIndexOf(".");
//        if(i > -1) s = s.substring(i + 1);
//        s = s + ".class";
//        System.out.println("name " +s);
//        Object testPath = this.getClass().getResource(s);
//        System.out.println(testPath);

        // //http://javajdk.net/tutorial/javafx-8-hello-world-for-eclipse/
        //URL url = getClass().getResource("HelloWorldScene.fxml");

        String workingDir = Paths.get(".").toAbsolutePath().normalize().toString();
        System.out.println("Working Dir: "+workingDir);

        // Works when running in IDE:
        //URL url = new URL("file:/"+workingDir+"/foo/src/main/java/com/example/HelloWorldScene.fxml");

        // Works for bin folder:
        URL url = new URL("file:/"+workingDir+"/HelloWorldScene.fxml");

        AnchorPane pane = FXMLLoader.load( url );
        Scene scene = new Scene( pane );

        // setting the stage
        primaryStage.setScene( scene );
        primaryStage.setTitle( "Hello World Demo" );
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}