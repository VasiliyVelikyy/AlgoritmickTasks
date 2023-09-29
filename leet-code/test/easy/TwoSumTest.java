package easy;

import easy.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum solution = new TwoSum();
        int[] expected = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] actual = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, actual);

        expected = solution.twoSum(new int[]{3, 2, 4}, 6);
        actual = new int[]{1, 2};
        Assertions.assertArrayEquals(expected, actual);

        expected = solution.twoSum(new int[]{3, 3}, 6);
        actual = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, actual);

        expected = solution.twoSum(new int[]{0,4,3,0}, 0);
        actual = new int[]{0, 3};
        Assertions.assertArrayEquals(expected, actual);

        expected = solution.twoSum(new int[]{-1,-2,-3,-4,-5}, -8);
        actual = new int[]{2,4};
        Assertions.assertArrayEquals(expected, actual);
    }
}