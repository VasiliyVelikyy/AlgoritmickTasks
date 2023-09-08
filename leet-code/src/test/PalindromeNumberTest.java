package test;

import easy.PalindromeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean expected = true;
        boolean actual = palindromeNumber.isPalindrome(121);
        Assertions.assertEquals(expected, actual);

        expected = false;
        actual = palindromeNumber.isPalindrome(-121);
        Assertions.assertEquals(expected, actual);

        expected = false;
        actual = palindromeNumber.isPalindrome(10);
        Assertions.assertEquals(expected, actual);
    }
}