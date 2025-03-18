package easy.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void isPalindrome() {
        boolean expected = true;
        boolean actual = palindromeNumber.isPalindrome(121);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPalindrome2() {
        boolean expected = false;
        boolean actual = palindromeNumber.isPalindrome(-121);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPalindrome3() {
        boolean expected = false;
        boolean actual = palindromeNumber.isPalindrome(10);
        Assertions.assertEquals(expected, actual);
    }
}