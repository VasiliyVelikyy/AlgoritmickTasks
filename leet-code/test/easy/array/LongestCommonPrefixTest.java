package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    LongestCommonPrefix solution = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        String expected = "fl";
        String actual = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefix2() {
        String expected = "";
        String actual = solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefix3() {
        String expected = "flower";
        String actual = solution.longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"});
        assertEquals(expected, actual);
    }

    @Test
    void longestCommonPrefix4() {
        String expected = "a";
        String actual = solution.longestCommonPrefix(new String[]{"ab", "a"});
        assertEquals(expected, actual);
    }
}