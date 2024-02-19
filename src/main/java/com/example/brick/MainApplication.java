package com.example.brick;

import com.example.brick.Objects.Ball;
import com.example.brick.Untils.LayoutManager;
import com.example.brick.Untils.PhysicsManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        int i;
        AnchorPane rootPane = new AnchorPane();
        PhysicsManager physicsManager = new PhysicsManager();
        LayoutManager layoutManager = new LayoutManager(rootPane);
        Ball ball = new Ball(5);
        ball.setXY(100,100);
        layoutManager.add(ball);
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