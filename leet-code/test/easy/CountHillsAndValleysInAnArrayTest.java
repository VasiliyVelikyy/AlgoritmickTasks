package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountHillsAndValleysInAnArrayTest {

    @Test
    void countHillValley() {
        CountHillsAndValleysInAnArray solution = new CountHillsAndValleysInAnArray();
        int actual = solution.countHillValley(new int[]{2, 4, 1, 1, 6, 5});
        int expected = 3;
        assertEquals(expected, actual);

        actual = solution.countHillValley(new int[]{6, 6, 5, 5, 4, 1});
        expected = 0;
        assertEquals(expected, actual);

        actual = solution.countHillValley(new int[]{6,5,10});
        expected = 1;
        assertEquals(expected, actual);

        actual = solution.countHillValley(new int[]{6,5,5,10});
        expected = 1;
        assertEquals(expected, actual);

        actual = solution.countHillValley(new int[]{57,57,57,57,57,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,85,85,85,86,86,86});
        expected = 2;
        assertEquals(expected, actual);
    }
}