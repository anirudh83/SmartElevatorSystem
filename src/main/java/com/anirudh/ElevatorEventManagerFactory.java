package com.anirudh;

/**
 * Created by anirudh on 05/10/14.
 */
public class ElevatorEventManagerFactory {
    private InProcessElevatorEventManager inProcessElevatorEventManager;

    public static EventManager getInstance() {
        return new InProcessElevatorEventManager();
    }
}
