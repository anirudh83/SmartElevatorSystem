package com.anirudh;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by anirudh on 24/09/14.
 */
public interface Processor {
    void process(Event event);


}
