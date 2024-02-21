package com.example.brick.Objects;

import com.example.brick.Actions.Action;

import java.util.ArrayList;
import java.util.List;

public abstract class PhysicalObject extends LayoutObject {
    private int attribute;
    private final List<Action> actionList = new ArrayList<>();
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

    public void addAction(Action action) {
        action.setOwner(this);
        this.actionList.add(action);
    }

    public List<Action> getActionList() {
        return actionList;
    }

    public void setAttribute(int attribute) {
        if(attribute != 0 && attribute != 1) throw new IllegalArgumentException("Unexpected PhysicalAttribute!");
        this.attribute = attribute;
    }

}
