package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateLettersTest {

    RemoveDuplicateLetters solution = new RemoveDuplicateLetters();

    @Test
    void removeDuplicateLetters() {
        String actual = solution.removeDuplicateLetters("bcabc");
        String expected = "abc";
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicateLetters2() {
        String actual = solution.removeDuplicateLetters("cbacdcbc");
        String expected = "acdb";
        assertEquals(expected, actual);
    }
}