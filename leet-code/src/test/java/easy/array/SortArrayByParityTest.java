package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortArrayByParityTest {

    SortArrayByParity solution = new SortArrayByParity();

    @Test
    void sortArrayByParity() {
        int[] actual = solution.sortArrayByParity(new int[]{3, 1, 2, 4});
        int[] expected = new int[]{2, 4, 3, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortArrayByParity2() {
        int[] actual = solution.sortArrayByParity(new int[]{0});
        int[] expected = new int[]{0};
        assertArrayEquals(expected, actual);
    }
}