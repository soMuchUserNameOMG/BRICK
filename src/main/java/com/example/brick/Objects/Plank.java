package com.example.brick.Objects;

import com.example.brick.Actions.Action;
import javafx.event.Event;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Plank extends PhysicalObject {
    private double width;
    private double height;

    public Plank(double length, double height) {
        this.width = length;
        this.height = height;
        this.color = Color.WHITE;
        initializeDefaultAction();
    }

    public Plank(double length, double height,Paint color) {
        this(length, height);
        this.color = color;
        initializeDefaultAction();
    }

    private void initializeDefaultAction() {
        this.addAction(new Action(Action.ON_MOUSE_DRAGGED) {
            @Override
            public void act() {

            }

            @Override
            public void act(Event event) {
                MouseEvent mouseEvent = (MouseEvent) event;
                double mouseX = mouseEvent.getX()+Plank.this.getX();
                Plank.this.setX(mouseX - Plank.this.width/2);
            }
        });
    }

    @Override
    protected Shape constructRenderableShape() {
        return new Rectangle(width, height, color);
    }

}
