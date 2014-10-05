package com.anirudh;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by anirudh on 24/09/14.
 */
public interface EventManager {

    public void post(Event event);

    public void shutdown();

    void register(Processor processor);

}
