package com.example.brick.Objects;

import javafx.scene.shape.Shape;

public abstract class LayoutObject {
    private double x;
    private double y;
    protected String SHAPE_SORT;

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

    public String getSHAPE_SORT() {
        return SHAPE_SORT;
    }

    public void setSHAPE_SORT(String SHAPE_SORT) {
        this.SHAPE_SORT = SHAPE_SORT;
    }


    public LayoutObject() {

    }
    public LayoutObject(String SHAPE_SORT) {
        this.SHAPE_SORT = SHAPE_SORT;
    }

    public LayoutObject(double x, double y, String SHAPE_SORT) {
        this.x = x;
        this.y = y;
        this.SHAPE_SORT = SHAPE_SORT;
    }

    public String getShapeSort() {
        return SHAPE_SORT;
    }

    public abstract Shape getRenderableShape();
}
