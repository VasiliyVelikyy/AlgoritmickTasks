package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostClimbingStairsTest {

    MinCostClimbingStairs solution = new MinCostClimbingStairs();

    @Test
    void minCostClimbingStairs() {
        int actual = solution.minCostClimbingStairs(new int[]{10, 15, 20});
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void minCostClimbingStairs2() {
        int actual = solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        int expected = 6;
        assertEquals(expected, actual);
    }
}