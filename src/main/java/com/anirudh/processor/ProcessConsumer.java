package com.anirudh.processor;

import com.anirudh.event.Event;
import com.anirudh.processor.Processor;

import java.util.concurrent.BlockingQueue;

/**
 * Created by anirudh on 05/10/14.
 */
public class ProcessConsumer implements Runnable {

    private Processor processor;
    private BlockingQueue<Event> eventQueue;

    public ProcessConsumer(Processor processor, BlockingQueue<Event> eventQueue) {
        this.processor = processor;
        this.eventQueue = eventQueue;
    }

    @Override
    public void run() {
        //Every event is processed in a new Thread
        Event event = null;
        try {
            event = eventQueue.take();
            processor.process(event);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
