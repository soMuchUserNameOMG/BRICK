package com.example.brick.Objects;

import com.example.brick.Events.Event;
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
    }

    public Plank(double length, double height,Paint color) {
        this(length, height);
        this.color = color;
    }

    @Override
    protected Shape constructRenderableShape() {
        return new Rectangle(width, height, color);
    }

    @Override
    public void addEventHandler(Event e) {

    }
}
