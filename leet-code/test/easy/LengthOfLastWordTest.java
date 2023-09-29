package easy;

import easy.LengthOfLastWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord() {
        LengthOfLastWord solution = new LengthOfLastWord();
        int actual = solution.lengthOfLastWord("Hello World");
        int expected = 5;
        assertEquals(expected, actual);

        actual = solution.lengthOfLastWord("   fly me   to   the moon  ");
        expected = 4;
        assertEquals(expected, actual);

        actual = solution.lengthOfLastWord("luffy is still joyboy");
        expected = 6;
        assertEquals(expected, actual);
    }
}