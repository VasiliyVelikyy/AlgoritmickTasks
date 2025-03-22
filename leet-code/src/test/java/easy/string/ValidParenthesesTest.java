package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesTest {
    ValidParentheses solution = new ValidParentheses();

    @Test
    void isValid() {
        boolean expected = true;
        boolean actual = solution.isValid("()");
        assertEquals(expected, actual);
    }

    @Test
    void isValid2() {
        boolean expected = true;
        boolean actual = solution.isValid("()[]{}");
        assertEquals(expected, actual);
    }

    @Test
    void isValid3() {
        boolean expected = false;
        boolean actual = solution.isValid("(]");
        assertEquals(expected, actual);
    }

    @Test
    void isValid4() {
        boolean expected = true;
        boolean actual = solution.isValid("{[]}");
        assertEquals(expected, actual);
    }

    @Test
    void isValid5() {
        boolean expected = false;
        boolean actual = solution.isValid("]");
        assertEquals(expected, actual);
    }

    @Test
    void isValid6() {
        boolean expected = false;
        boolean actual = solution.isValid("[");
        assertEquals(expected, actual);
    }

}