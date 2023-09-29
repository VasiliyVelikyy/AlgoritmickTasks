package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    @Test
    void findPeakElement() {
        FindPeakElement solution = new FindPeakElement();
        int actual = solution.findPeakElement(new int[]{1, 2, 3, 1});
        int expected = 2;
        assertEquals(expected, actual);

        actual = solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        expected = 5;
        assertEquals(expected, actual);

        actual = solution.findPeakElement(new int[]{1,2});
        expected = 1;
        assertEquals(expected, actual);

        actual = solution.findPeakElement(new int[]{1});
        expected = 0;
        assertEquals(expected, actual);

        actual = solution.findPeakElement(new int[]{3,1,2});
        expected = 0;
        assertEquals(expected, actual);

        actual = solution.findPeakElement(new int[]{1,2,3});
        expected = 2;
        assertEquals(expected, actual);
    }
}