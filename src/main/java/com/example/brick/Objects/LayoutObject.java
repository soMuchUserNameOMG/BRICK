package com.example.brick.Objects;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;

public abstract class LayoutObject {
    protected double x;
    protected double y;

    protected final SimpleDoubleProperty xProperty = new SimpleDoubleProperty();
    protected final SimpleDoubleProperty yProperty = new SimpleDoubleProperty();
    protected Paint color;
    protected Shape renderableShape;

    public SimpleDoubleProperty xProperty() {
        return this.xProperty;
    }

    public SimpleDoubleProperty yProperty() {
        return this.yProperty;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.xProperty.set(x);
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.yProperty.set(y);
        this.y = y;

    }

    public void setXY(double x, double y) {
        this.xProperty.set(x);
        this.yProperty.set(y);
        this.x = x;
        this.y = y;
    }


    public LayoutObject() {

    }

    public LayoutObject(double x, double y) {
        this.x = x;
        this.y = y;
        this.xProperty.set(x);
        this.yProperty.set(y);
    }

    public Shape getRenderableShape() {
        if(this.renderableShape == null) {
            this.renderableShape = constructRenderableShape();
        }
        return this.renderableShape;
    }

    protected abstract Shape constructRenderableShape();



}
