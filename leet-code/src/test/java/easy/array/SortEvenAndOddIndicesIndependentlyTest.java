package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortEvenAndOddIndicesIndependentlyTest {

    SortEvenAndOddIndicesIndependently solution = new SortEvenAndOddIndicesIndependently();

    @Test
    void sortEvenOdd() {
        int[] actual = solution.sortEvenOdd(new int[]{4, 1, 2, 3});
        int[] expected = new int[]{2, 3, 4, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortEvenOdd2() {
        int[] actual = solution.sortEvenOdd(new int[]{2, 1});
        int[] expected = new int[]{2, 1};
        assertArrayEquals(expected, actual);
    }
}