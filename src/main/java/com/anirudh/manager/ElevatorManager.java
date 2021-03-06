package com.anirudh.manager;

import com.anirudh.event.ElevatorEventManagerFactory;
import com.anirudh.event.Event;
import com.anirudh.event.EventManager;

/**
 * Created by anirudh on 24/09/14.
 */
public class ElevatorManager {

    private EventManager eventManager;

    public void fetchElevatorCurrentFloor() {

    }

    public void moveElevatorToFloor(int currentFloor, int toFloor) {
        Event event = new Event();
        event.setFromFloor(currentFloor);
        event.setToFloor(toFloor);
        getEventManager().post(event);
    }

    public EventManager getEventManager() {
        if(eventManager==null){
            return ElevatorEventManagerFactory.getInstance();
        }else {
            return eventManager;
        }
    }


}

