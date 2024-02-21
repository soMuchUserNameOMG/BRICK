package com.example.brick.Actions;

import com.example.brick.Objects.LayoutObject;
import javafx.event.Event;
import javafx.scene.input.MouseEvent;

public abstract class Action {
    private LayoutObject owner;
    private String actionTime;
    public static final String ON_MOUSE_CLICKED = "ON_MOUSE_CLICKED";
    public static final String ON_MOUSE_DRAGGED = "ON_MOUSE_DRAGGED";


    public Action(LayoutObject owner, String actionTime) {
        this.owner = owner;
        this.actionTime = actionTime;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public Action(String actionTime) {
        this.actionTime = actionTime;
    }

    public Action(){

    }

    public LayoutObject getOwner() {
        return owner;
    }

    public void setOwner(LayoutObject owner) {
        this.owner = owner;
    }

    public abstract void act();

    public abstract void act(Event event);

}
