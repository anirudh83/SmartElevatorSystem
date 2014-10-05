package com.anirudh;

/**
 * Created by anirudh on 05/10/14.
 */
public class ElevatorProcessor implements Processor {

    private Elevator elevator = new Elevator(0,Direction.STILL);

    public void process(Event event) {
        event.getToFloor();
        event.getFromFloor();
        if(event.getToFloor() - event.getFromFloor()>0){
            elevator.setDirection(Direction.UP);
        }
        elevator.moveToFloor(event.getToFloor());
    }

    public int getCurrentElevatorFloor(){
        return elevator.getCurrentFloor();
    }
}
