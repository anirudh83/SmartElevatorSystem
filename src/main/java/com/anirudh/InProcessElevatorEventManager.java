package com.anirudh;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by anirudh on 01/10/14.
 */
public class InProcessElevatorEventManager implements EventManager {

    BlockingQueue<Event> eventQueue = new LinkedBlockingDeque<Event>();

    public InProcessElevatorEventManager() {
        Processor elevatorProcessor = new ElevatorProcessor();
        new Thread(new ProcessConsumer(elevatorProcessor,eventQueue)).start();
    }

    @Override
    public void post(Event event) {
        eventQueue.add(event);
    }

    @Override
    public void shutdown() {

    }

    @Override
    public void register(Processor processor) {

    }
}
