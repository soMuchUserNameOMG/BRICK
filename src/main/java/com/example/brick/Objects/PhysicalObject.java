package com.example.brick.Objects;

public abstract class PhysicalObject extends LayoutObject {
    private int attribute;
    public static final int STATIC = 0;
    public static final int MOVING = 1;
    public static final int FOLLOWING_CURSOR = 2;

    public PhysicalObject() {
    }

    public PhysicalObject(double x, double y) {
        super(x, y);
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        if(attribute != 0 && attribute != 1) throw new IllegalArgumentException("Unexpected PhysicalAttribute!");
        this.attribute = attribute;
    }

}
