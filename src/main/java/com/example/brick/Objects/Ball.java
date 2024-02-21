package com.example.brick.Objects;

import com.example.brick.Untils.Shapes;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class Ball extends PhysicalObject {
    private double radius;


    public Ball(double radius) {
        this.radius = radius;
        this.color = Color.WHITE;
    }

    public Ball(double radius, Paint color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Paint getColor() {
        return color;
    }

    public void setColor(Paint color) {
        this.color = color;
    }

    @Override
    protected Shape constructRenderableShape() {
        return new Circle(radius,color);
    }

}
