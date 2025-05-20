package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheIndexOIfTheFirstOccurrenceInAStringTest {
    FindTheIndexOIfTheFirstOccurrenceInAString solution = new FindTheIndexOIfTheFirstOccurrenceInAString();

    @Test
    void strStr() {
        var answer = solution.strStr("sadbutsad", "sad");
        assertEquals(0, answer);
    }

    @Test
    void strStr2() {
        var answer = solution.strStr("leetcode", "leeto");
        assertEquals(-1, answer);
    }

    @Test
    void strStr3() {
        var answer = solution.strStr("aaa", "aaaa");
        assertEquals(-1, answer);
    }

    @Test
    void strStr4() {
        var answer = solution.strStr("mississippi", "issip");
        assertEquals(4, answer);
    }

    @Test
    void strStr5() {
        var answer = solution.strStr("mississippi", "issipi");
        assertEquals(-1, answer);
    }

    @Test
    void strStr6() {
        var answer = solution.strStr("mississippi", "pi");
        assertEquals(9, answer);
    }

    @Test
    void strStr7() {
        var answer = solution.strStr("a", "a");
        assertEquals(0, answer);
    }
}