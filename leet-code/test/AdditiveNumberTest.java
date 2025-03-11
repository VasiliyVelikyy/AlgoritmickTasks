import medium.fibonacci.AdditiveNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditiveNumberTest {

    @Test
    void isAdditiveNumber() {
        AdditiveNumber solution = new AdditiveNumber();
        boolean actual = solution.isAdditiveNumber("112358");
        assertTrue(actual);

        actual = solution.isAdditiveNumber("199100199");
        assertTrue(actual);
    }
}