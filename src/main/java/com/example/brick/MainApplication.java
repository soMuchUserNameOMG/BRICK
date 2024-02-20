package com.example.brick;

import com.example.brick.Objects.Ball;
import com.example.brick.Objects.Plank;
import com.example.brick.Untils.EventListener;
import com.example.brick.Untils.LayoutManager;
import com.example.brick.Untils.PhysicsManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        int i;
        AnchorPane rootPane = new AnchorPane();
        LayoutManager layoutManager = new LayoutManager(rootPane);
        EventListener eventListener = new EventListener();
        PhysicsManager physicsManager = new PhysicsManager(layoutManager,eventListener);
        Plank plank = new Plank(200,20);
        plank.setXY(400,700);
        Button button = new Button();
        layoutManager.add(plank);
        layoutManager.renderAll();
        Scene scene = new Scene(rootPane,1000,900, Color.BLACK);
        stage.setTitle("BRICK");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}