package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class TwoSumTest {
    TwoSum solution = new TwoSum();

    @Test
    public void twoSum() {
        int[] expected = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] actual = new int[]{0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoSum2() {
        int[] expected = solution.twoSum(new int[]{3, 2, 4}, 6);
        int[] actual = new int[]{1, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoSum3() {
        int[] expected = solution.twoSum(new int[]{3, 3}, 6);
        int[] actual = new int[]{0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoSum4() {
        int[] expected = solution.twoSum(new int[]{0, 4, 3, 0}, 0);
        int[] actual = new int[]{0, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoSum5() {
        int[] expected = solution.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
        int[] actual = new int[]{2, 4};
        assertArrayEquals(expected, actual);
    }
}