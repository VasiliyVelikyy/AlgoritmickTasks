package medium;

import hard.Candy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void candy() {
        Candy solution = new Candy();
        int actual = solution.candy(new int[]{1, 0, 2});
        int expected = 5;
        assertEquals(expected, actual);

        actual = solution.candy(new int[]{1, 2, 2});
        expected = 4;
        assertEquals(expected, actual);

        actual = solution.candy(new int[]{1,3,2,2,1});
        expected = 7;
        assertEquals(expected, actual);
    }
}