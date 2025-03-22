package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {

    LengthOfLastWord solution = new LengthOfLastWord();

    @Test
    void lengthOfLastWord() {
        int actual = solution.lengthOfLastWord("Hello World");
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLastWord2() {
        int actual = solution.lengthOfLastWord("   fly me   to   the moon  ");
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLastWord3() {
        int actual = solution.lengthOfLastWord("luffy is still joyboy");
        int expected = 6;
        assertEquals(expected, actual);
    }
}