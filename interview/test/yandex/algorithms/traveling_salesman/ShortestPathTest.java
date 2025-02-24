package yandex.algorithms.traveling_salesman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathTest {
    ShortestPath solution = new ShortestPath();
    ShortestPathRecursion solutionRecursion = new ShortestPathRecursion();
    int[][] towns = {
            {0, 5, 6, 14, 15},
            {5, 0, 7, 10, 6},
            {6, 7, 0, 8, 7},
            {14, 10, 8, 0, 9},
            {15, 6, 7, 9, 0}
    };
    @Test
    void evaluateShortestPath() {
        int actual = solution.bruteForceWhenKnownStructure(towns);
        assertEquals(25, actual);

    }

    @Test
    void evaluateShortestPathWithRecursion() {
        int actual = solutionRecursion.evaluate(towns);
        assertEquals(25, actual);

    }
}