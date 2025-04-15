package medium.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayTest {

    MaximumSubarray solution = new MaximumSubarray();

    @Test
    void maxSubArray() {
        int actual = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void maxSubArray2() {
        int actual = solution.maxSubArray(new int[]{1});
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void maxSubArray3() {
        int actual = solution.maxSubArray(new int[]{5, 4, -1, 7, 8});
        int expected = 23;
        assertEquals(expected, actual);
    }
}