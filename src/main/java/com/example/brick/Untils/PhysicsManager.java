package com.example.brick.Untils;

import com.example.brick.Actions.Action;
import com.example.brick.Objects.PhysicalObject;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class PhysicsManager {
    private final List<PhysicalObject> physicalObjectList = new ArrayList<>();


    public void add(PhysicalObject physicalObject) {
        physicalObjectList.add(physicalObject);
    }

    public void activeAction(PhysicalObject physicalObject) {
        for (Action action : physicalObject.getActionList()
                ) {
            switch (action.getActionTime()) {
                case Action.ON_MOUSE_DRAGGED -> {
                    action.getOwner().getRenderableShape().addEventHandler(MouseEvent.MOUSE_DRAGGED, event -> {
                        action.act(event);
                    });
                }
            }
        }
    }

    public void activeAll() {
        for (PhysicalObject physicalObject : physicalObjectList
                ) {
            activeAction(physicalObject);
        }
    }



}
