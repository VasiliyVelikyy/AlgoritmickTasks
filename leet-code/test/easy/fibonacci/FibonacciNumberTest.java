package easy.fibonacci;

import easy.FibonacciNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @Test
    void fib() {
        FibonacciNumber solution = new FibonacciNumber();
        int actual = solution.fib(2);
        int expected = 1;
        assertEquals(expected, actual);

        actual = solution.fib(3);
        expected = 2;
        assertEquals(expected, actual);

        actual = solution.fib(4);
        expected = 3;
        assertEquals(expected, actual);

        actual = solution.fib(6);
        expected = 8;
        assertEquals(expected, actual);
    }
}