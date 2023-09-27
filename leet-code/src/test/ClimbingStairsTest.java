package test;

import easy.ClimbingStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void climbStairs() {
        ClimbingStairs solution = new ClimbingStairs();
        int actual = solution.climbStairs(2);
        int expected = 2;
        assertEquals(expected, actual);

        actual = solution.climbStairs(3);
        expected = 3;
        assertEquals(expected, actual);

        actual = solution.climbStairs(5);
        expected = 8;
        assertEquals(expected, actual);

        actual = solution.climbStairs(6);
        expected = 13;
        assertEquals(expected, actual);
    }
}