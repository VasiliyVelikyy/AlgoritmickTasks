package easy.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtTest {

    Sqrt solution = new Sqrt();

    @Test
    void mySqrt() {
        int actual = solution.mySqrt(4);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void mySqrt2() {
        int actual = solution.mySqrt(8);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void mySqrt3() {
        int actual = solution.mySqrt(81);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void mySqrt4() {
        int actual = solution.mySqrt(80);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void mySqrt5() {
        int actual = solution.mySqrt(2147395600);
        int expected = 46340;
        assertEquals(expected, actual);
    }
}