package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    PlusOne solution = new PlusOne();

    @Test
    void plusOne() {

        int[] actual = solution.plusOne(new int[]{1, 2, 3});
        int[] expected = new int[]{1, 2, 4};
        assertArrayEquals(expected, actual);

    }

    @Test
    void plusOne2() {
        int[] actual = solution.plusOne(new int[]{1, 2, 9});
        int[] expected = new int[]{1, 3, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void plusOne3() {
        int[] actual = solution.plusOne(new int[]{4, 3, 2, 1});
        int[] expected = new int[]{4, 3, 2, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void plusOne4() {
        int[] actual = solution.plusOne(new int[]{9});
        int[] expected = new int[]{1, 0};
        assertArrayEquals(expected, actual);
    }
}