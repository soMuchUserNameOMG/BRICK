package com.example.brick.Objects;

import com.example.brick.Untils.Shapes;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class Ball extends PhysicalObject {
    private double radius;
    private Paint color;

    private Shape renderableShape;

    public Ball(double radius) {
        super(Shapes.CIRCLE);
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
    public Shape getRenderableShape() {
        this.renderableShape = new Circle(radius,color);
        return this.renderableShape;
    }
}
