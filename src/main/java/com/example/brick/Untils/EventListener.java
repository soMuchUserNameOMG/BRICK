package com.example.brick.Untils;

import com.example.brick.Interfaces.Eventable;

import java.util.ArrayList;
import java.util.List;

public class EventListener {
    private final List<Eventable> listeningList = new ArrayList<>();
    private final Runnable listenThread = new Runnable() {
        @Override
        public void run() {

        }
    };
}
