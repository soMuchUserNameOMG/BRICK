package com.example.brick.Objects;

import com.example.brick.Interfaces.Eventable;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;

public abstract class LayoutObject implements Eventable {
    protected double x;
    protected double y;
    protected Paint color;
    protected Shape renderableShape;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public LayoutObject() {

    }

    public LayoutObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Shape getRenderableShape() {
        if(this.renderableShape == null) {
            this.renderableShape = constructRenderableShape();
        }
        return this.renderableShape;
    }

    protected abstract Shape constructRenderableShape();



}
