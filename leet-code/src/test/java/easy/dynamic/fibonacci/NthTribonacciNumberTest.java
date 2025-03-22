package easy.dynamic.fibonacci;

import easy.dynamic.NthTribonacciNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NthTribonacciNumberTest {

    NthTribonacciNumber solution = new NthTribonacciNumber();

    @Test
    void tribonacci() {
        int actual = solution.tribonacci(4);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void tribonacci2() {
        int actual = solution.tribonacci(25);
        int expected = 1389537;
        assertEquals(expected, actual);
    }
}