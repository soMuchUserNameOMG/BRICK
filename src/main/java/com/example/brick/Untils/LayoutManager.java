package com.example.brick.Untils;

import com.example.brick.Objects.LayoutObject;
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
        double x = layoutObject.getX();
        double y = layoutObject.getY();
        Shape renderableShape = layoutObject.getRenderableShape();
        renderableShape.setLayoutX(x);
        renderableShape.setLayoutY(y);
        rootPane.getChildren().add(renderableShape);
    }

    public void renderAll() {
        for (LayoutObject layoutObject: objectsList
             ) {
            render(layoutObject);
        }
    }

    public void renderFrom(int index) {

    }


}
