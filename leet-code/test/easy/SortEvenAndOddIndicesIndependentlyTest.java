package easy;

import easy.SortEvenAndOddIndicesIndependently;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortEvenAndOddIndicesIndependentlyTest {

    @Test
    void sortEvenOdd() {
        SortEvenAndOddIndicesIndependently solution = new SortEvenAndOddIndicesIndependently();
        int[] actual = solution.sortEvenOdd(new int[]{4, 1, 2, 3});
        int[] expected = new int[]{2, 3, 4, 1};
        assertArrayEquals(expected, actual);

        actual = solution.sortEvenOdd(new int[]{2, 1});
        expected = new int[]{2, 1};
        assertArrayEquals(expected, actual);

    }
}