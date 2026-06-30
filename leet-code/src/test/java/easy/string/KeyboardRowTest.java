package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KeyboardRowTest {
    private final KeyboardRow keyboardRow = new KeyboardRow();

    @Test
    void findWords1() {
        String[] actual = keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        assertArrayEquals(new String[]{"Alaska", "Dad"}, actual);
    }

    @Test
    void findWords2() {
        String[] actual = keyboardRow.findWords(new String[]{"omk"});
        assertArrayEquals(new String[]{}, actual);
    }

    @Test
    void findWords3() {
        String[] actual = keyboardRow.findWords(new String[]{"adsdf", "sfd"});
        assertArrayEquals(new String[]{"adsdf", "sfd"}, actual);
    }
}