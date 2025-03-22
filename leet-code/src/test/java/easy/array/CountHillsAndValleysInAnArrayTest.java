package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountHillsAndValleysInAnArrayTest {

    CountHillsAndValleysInAnArray solution = new CountHillsAndValleysInAnArray();

    @Test
    void countHillValley() {
        int actual = solution.countHillValley(new int[]{2, 4, 1, 1, 6, 5});
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void countHillValley2() {
        int actual = solution.countHillValley(new int[]{6, 6, 5, 5, 4, 1});
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void countHillValley3() {
        int actual = solution.countHillValley(new int[]{6, 5, 10});
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void countHillValley4() {
        int actual = solution.countHillValley(new int[]{6, 5, 5, 10});
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    void countHillValley5() {
        int actual = solution.countHillValley(new int[]{57, 57, 57, 57, 57, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 85, 85, 85, 86, 86, 86});
        int expected = 2;
        assertEquals(expected, actual);
    }
}