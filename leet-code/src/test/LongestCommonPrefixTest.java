package test;

import easy.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String expected = "fl";
        String actual= solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals(expected, actual);

        expected = "";
        actual = solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        assertEquals(expected, actual);

        expected = "flower";
        actual = solution.longestCommonPrefix(new String[]{"flower","flower","flower","flower"});
        assertEquals(expected, actual);

                expected = "a";
        actual = solution.longestCommonPrefix(new String[]{"ab", "a"});
        assertEquals(expected, actual);
    }
}