package test;

import easy.SortArrayByParity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    @Test
    void sortArrayByParity() {
        SortArrayByParity solution = new SortArrayByParity();
        int[] actual = solution.sortArrayByParity(new int[]{3, 1, 2, 4});
        int[] expected = new int[]{2, 4, 3, 1};
        assertArrayEquals(expected, actual);

        actual = solution.sortArrayByParity(new int[]{0});
        expected = new int[]{0};
        assertArrayEquals(expected, actual);
    }
}