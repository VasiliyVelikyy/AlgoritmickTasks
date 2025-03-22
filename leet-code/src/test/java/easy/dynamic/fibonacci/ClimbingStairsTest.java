package easy.dynamic.fibonacci;

import easy.dynamic.fibonaci.ClimbingStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    ClimbingStairs solution = new ClimbingStairs();

    @Test
    void climbStairs() {
        int actual = solution.climbStairs(2);
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    void climbStairs2() {
        int actual = solution.climbStairs(3);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void climbStairs3() {
        int actual = solution.climbStairs(5);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void climbStairs4() {
        int actual = solution.climbStairs(6);
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    void climbStairs5() {
        int actual = solution.climbStairs(4);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void climbStairs6() {
        int actual = solution.climbStairs(45);
        int expected = 1836311903;
        assertEquals(expected, actual);
    }


}