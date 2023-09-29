package easy;

import easy.ValidPerfectSquare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPerfectSquareTest {

    @Test
    void isPerfectSquare() {
        ValidPerfectSquare solution = new ValidPerfectSquare();
        boolean actual = solution.isPerfectSquare(16);
        assertEquals(true, actual);

        actual = solution.isPerfectSquare(14);
        assertEquals(false, actual);

        actual = solution.isPerfectSquare(100000001);
        assertEquals(false, actual);
    }
}