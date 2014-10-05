package com.anirudh.event;

import com.anirudh.event.Event;
import com.anirudh.processor.Processor;

/**
 * Created by anirudh on 24/09/14.
 */
public interface EventManager {

    public void post(Event event);

    public void shutdown();

    void register(Processor processor);

}
