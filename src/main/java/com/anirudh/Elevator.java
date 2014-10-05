package com.anirudh;

/**
 * Created by anirudh on 24/09/14.
 */
public class Elevator {

    private int currentFloor;
    private Direction direction;

    public Elevator(int currentFloor, Direction direction) {
        this.currentFloor = currentFloor;
        this.direction = direction;
    }

    public void moveToFloor(int floor) {
        this.currentFloor = floor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
