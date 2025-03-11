package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void testIsAnagram() {
        var answer = validAnagram.isAnagram("anagram", "nagaram");
        assertTrue(answer);
    }

    @Test
    public void testIsAnagram2() {
        var answer = validAnagram.isAnagram("rat", "car");
        assertFalse(answer);
    }

    @Test
    public void testIsAnagram3() {
        var answer = validAnagram.isAnagram("aacc", "ccac");
        assertFalse(answer);
    }
}