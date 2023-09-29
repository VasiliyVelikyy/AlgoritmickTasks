package medium;

import medium.RemoveDuplicateLetters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {

    @Test
    void removeDuplicateLetters() {
        RemoveDuplicateLetters solution = new RemoveDuplicateLetters();
        String actual = solution.removeDuplicateLetters("bcabc");
        String expected = "abc";
        assertEquals(expected, actual);

        actual = solution.removeDuplicateLetters("cbacdcbc");
        expected = "acdb";
        assertEquals(expected, actual);
    }
}