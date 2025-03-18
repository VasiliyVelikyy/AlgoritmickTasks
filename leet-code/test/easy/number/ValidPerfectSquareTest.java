package easy.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPerfectSquareTest {

    ValidPerfectSquare solution = new ValidPerfectSquare();

    @Test
    void isPerfectSquare() {
        boolean actual = solution.isPerfectSquare(16);
        assertTrue(actual);
    }

    @Test
    void isPerfectSquare2() {
        boolean actual = solution.isPerfectSquare(14);
        assertFalse(actual);
    }

    @Test
    void isPerfectSquare3() {
        boolean actual = solution.isPerfectSquare(100000001);
        assertFalse(actual);
    }
}