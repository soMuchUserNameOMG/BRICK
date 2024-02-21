package com.example.brick.Untils;

import com.example.brick.Objects.LayoutObject;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

import java.util.ArrayList;

public class LayoutManager {
    private final ArrayList<LayoutObject> objectsList = new ArrayList();
    private Pane rootPane;

    public LayoutManager() {

    }

    public LayoutManager(Pane rootPane) {
        this.rootPane = rootPane;
    }

    public void add(LayoutObject layoutObject) {

        objectsList.add(layoutObject);

    }

    public void addAll(LayoutObject... layoutObjects) {

    }

    private void render(LayoutObject layoutObject) {
        Shape renderableShape = layoutObject.getRenderableShape();
        renderableShape.setLayoutX(layoutObject.getX());
        renderableShape.setLayoutY(layoutObject.getY());
        layoutObject.xProperty().addListener((observable, oldValue, newValue) -> renderableShape.setLayoutX(newValue.doubleValue()));
        layoutObject.yProperty().addListener((observable, oldValue, newValue) -> renderableShape.setLayoutY(newValue.doubleValue()));
        rootPane.getChildren().add(renderableShape);
    }

    public void renderAll() {
        for (LayoutObject layoutObject: objectsList
             ) {
            render(layoutObject);
        }
    }



}
