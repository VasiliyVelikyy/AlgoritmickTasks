package easy;

import easy.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses solution = new ValidParentheses();
        boolean expected = true;
        boolean actual = solution.isValid("()");
        assertEquals(expected, actual);

        expected = true;
        actual = solution.isValid("()[]{}");
        assertEquals(expected, actual);

        expected = false;
        actual = solution.isValid("(]");
        assertEquals(expected, actual);

        expected = true;
        actual = solution.isValid("{[]}");
        assertEquals(expected, actual);

        expected = false;
        actual = solution.isValid("]");
        assertEquals(expected, actual);


    }
}