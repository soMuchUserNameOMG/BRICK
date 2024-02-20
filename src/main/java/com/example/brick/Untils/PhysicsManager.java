package com.example.brick.Untils;

import com.example.brick.Objects.PhysicalObject;

import java.util.ArrayList;
import java.util.List;

public class PhysicsManager {
    private final List<PhysicalObject> physicalObjectList = new ArrayList<>();
    private final LayoutManager layoutManager;
    private final EventListener eventListener;

    public PhysicsManager(LayoutManager layoutManager, EventListener eventListener) {
        this.layoutManager = layoutManager;
        this.eventListener = eventListener;
    }

    public void add(PhysicalObject physicalObject) {
        physicalObjectList.add(physicalObject);
    }


}
