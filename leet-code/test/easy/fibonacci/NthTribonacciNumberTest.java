package easy.fibonacci;

import easy.NthTribonacciNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {

    @Test
    void tribonacci() {
        NthTribonacciNumber solution = new NthTribonacciNumber();
        int actual = solution.tribonacci(4);
        int expected = 4;
        assertEquals(expected, actual);

        actual = solution.tribonacci(25);
        expected = 1389537;
        assertEquals(expected, actual);
    }
}