package easy.dynamic.fibonacci;

import easy.dynamic.fibonaci.FibonacciNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberTest {

    FibonacciNumber solution = new FibonacciNumber();

    @Test
    void fib() {
        int actual = solution.fib(2);
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    void fib2() {
        int actual = solution.fib(3);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void fib3() {
        int actual = solution.fib(4);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void fib4() {
        int actual = solution.fib(6);
        int expected = 8;
        assertEquals(expected, actual);
    }
}