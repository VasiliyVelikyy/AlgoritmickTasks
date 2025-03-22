package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void isPalindrome1() {
        var actual = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(actual);
    }

    @Test
    void isPalindrome2() {
        var actual = validPalindrome.isPalindrome("race a car");
        assertFalse(actual);
    }

    @Test
    void isPalindrome3() {
        var actual = validPalindrome.isPalindrome(" ");
        assertTrue(actual);
    }

}