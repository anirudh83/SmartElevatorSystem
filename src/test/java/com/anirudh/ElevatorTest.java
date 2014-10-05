package com.anirudh;

import com.anirudh.manager.ElevatorManager;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anirudh on 24/09/14.
 */
public class ElevatorTest {

    private ElevatorManager manager;

    @Before
    public void init() {
        manager = new ElevatorManager();
    }

    @Test
    public void shouldTakeElevatorFrom5thFloorTo1stFloor() {
        manager.moveElevatorToFloor(1, 5);
    }
}
