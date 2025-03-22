package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromeTest {
    LongestPalindrome solution = new LongestPalindrome();

    @Test
    void longestPalindrome() {
        var actual = solution.longestPalindrome("abccccdd");
        assertEquals(7, actual);
    }

    @Test
    void longestPalindrome2() {
        var actual = solution.longestPalindrome("a");
        assertEquals(1, actual);
    }
}