package medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSubstringsBetweenEachPairOfParenthesesTest {

    @Test
    void reverseParentheses() {
        ReverseSubstringsBetweenEachPairOfParentheses solution = new ReverseSubstringsBetweenEachPairOfParentheses();
        String initialString="(u(love)i)";
        String actual=solution.reverseParentheses(initialString);
        String expected="iloveu";
        assertEquals(actual,expected);
    }

    @Test
    void reverseParentheses2() {
        ReverseSubstringsBetweenEachPairOfParentheses solution = new ReverseSubstringsBetweenEachPairOfParentheses();
        String initialString="(abcd)";
        String actual=solution.reverseParentheses(initialString);
        String expected="dcba";
        assertEquals(actual,expected);
    }

    @Test
    void reverseParentheses3() {
        ReverseSubstringsBetweenEachPairOfParentheses solution = new ReverseSubstringsBetweenEachPairOfParentheses();
        String initialString="(ed(et(oc))el)";
        String actual=solution.reverseParentheses(initialString);
        String expected="leetcode";
        assertEquals(actual,expected);
    }
}