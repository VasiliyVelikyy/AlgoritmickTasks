package test;

import easy.PlusOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void plusOne() {
        PlusOne solution = new PlusOne();
        int[] actual = solution.plusOne(new int[]{1, 2, 3});
        int[] expected = new int[]{1, 2, 4};
        assertArrayEquals(expected, actual);

        actual = solution.plusOne(new int[]{1, 2, 9});
        expected = new int[]{1, 3, 0};
        assertArrayEquals(expected, actual);

        actual = solution.plusOne(new int[]{4, 3, 2, 1});
        expected = new int[]{4, 3, 2, 2};
        assertArrayEquals(expected, actual);

        actual = solution.plusOne(new int[]{9});
        expected = new int[]{1, 0};
        assertArrayEquals(expected, actual);
    }
}