package com.mycompany.org.openjfx.epresent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
//        var javaVersion = SystemInfo.javaVersion();
//        var javafxVersion = SystemInfo.javafxVersion();

//        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var label = new Label("Selamat datang di Aplikasi E-Present");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.setTitle("E-Present");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}