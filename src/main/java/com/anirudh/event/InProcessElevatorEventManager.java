package com.anirudh.event;

import com.anirudh.processor.ProcessConsumer;
import com.anirudh.processor.ElevatorProcessor;
import com.anirudh.processor.Processor;

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
