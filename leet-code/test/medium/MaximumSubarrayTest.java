package medium;

import medium.MaximumSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        MaximumSubarray solution = new MaximumSubarray();
        int actual = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        int expected = 6;
        assertEquals(expected, actual);

        actual = solution.maxSubArray(new int[]{1});
        expected = 1;
        assertEquals(expected, actual);

        actual = solution.maxSubArray(new int[]{5, 4, -1, 7, 8});
        expected = 23;
        assertEquals(expected, actual);
    }
}