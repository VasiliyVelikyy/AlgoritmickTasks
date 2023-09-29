package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {

    @Test
    void isMonotonic() {
        MonotonicArray solution = new MonotonicArray();
        boolean actual = solution.isMonotonic(new int[]{1, 2, 2, 3});
        assertTrue(actual);

        actual = solution.isMonotonic(new int[]{6, 5, 4, 4});
        assertTrue(actual);

        actual = solution.isMonotonic(new int[]{1, 3, 2});
        assertFalse(actual);

        actual = solution.isMonotonic(new int[]{1,1,0});
        assertTrue(actual);
    }
}