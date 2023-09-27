package test;

import easy.Sqrt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void mySqrt() {
        Sqrt solution = new Sqrt();
        int actual = solution.mySqrt(4);
        int expected = 2;
        assertEquals(expected, actual);

        actual = solution.mySqrt(8);
        expected = 2;
        assertEquals(expected, actual);

        actual = solution.mySqrt(81);
        expected = 9;
        assertEquals(expected, actual);

        actual = solution.mySqrt(80);
        expected = 8;
        assertEquals(expected, actual);

        actual = solution.mySqrt(2147395600);
        expected = 46340;
        assertEquals(expected, actual);
    }
}