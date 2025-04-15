package medium.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertIntervalTest {
    InsertInterval solution = new InsertInterval();

    @Test
    void insert() {
        int[][] array = {
                {1, 3},
                {6, 9}
        };
        var actual = solution.insert(array, new int[]{2, 5});
        int[][] expected = {
                {1, 5},
                {6, 9}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void insert2() {
        int[][] array = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };
        var actual = solution.insert(array, new int[]{4, 8});
        int[][] expected = {
                {1, 2},
                {3, 10},
                {12, 16}

        };
        assertArrayEquals(expected, actual);
    }
}