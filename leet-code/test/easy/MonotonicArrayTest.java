package easy;

import easy.array.MonotonicArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MonotonicArrayTest {

    MonotonicArray solution = new MonotonicArray();

    @Test
    void isMonotonic() {

        boolean actual = solution.isMonotonic(new int[]{1, 2, 2, 3});
        assertTrue(actual);
    }

    @Test
    void isMonotonic2() {
        boolean actual = solution.isMonotonic(new int[]{6, 5, 4, 4});
        assertTrue(actual);
    }

    @Test
    void isMonotonic3() {
        boolean actual = solution.isMonotonic(new int[]{1, 3, 2});
        assertFalse(actual);
    }

    @Test
    void isMonotonic4() {
        boolean actual = solution.isMonotonic(new int[]{1, 1, 0});
        assertTrue(actual);
    }
}