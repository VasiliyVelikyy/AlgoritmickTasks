package easy;

import easy.MinCostClimbingStairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    void minCostClimbingStairs() {
        MinCostClimbingStairs solution = new MinCostClimbingStairs();
        int actual = solution.minCostClimbingStairs(new int[]{10, 15, 20});
        int expected = 15;
        assertEquals(expected, actual);

        actual = solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        expected = 6;
        assertEquals(expected, actual);
    }
}