package org.leetcode.problems.stack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.leetcode.problems.TestInputs.*;

@RunWith(Parameterized.class)
public class CarFleetTest {
    private int target;
    private int[] position;
    private int[] speed;
    private int expected;

    public CarFleetTest(int target, int[] position, int[] speed, int expected) {
        this.target = target;
        this.position = position;
        this.speed = speed;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(CAR_FLEET);
    }

    @Test
    public void test() {
        CarFleet solution = new CarFleet();
        assertEquals(expected, solution.carFleet(target,position,speed));
    }
}