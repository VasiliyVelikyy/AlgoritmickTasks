package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPrefixCheckerTest {
    WordPrefixChecker solution = new WordPrefixChecker();

    @Test
    void isPrefixOfWord() {
        int actual = solution.isPrefixOfWord("i love eating burger", "burg");
        assertEquals(4, actual);
    }

    @Test
    void isPrefixOfWor2() {
        int actual = solution.isPrefixOfWord("this problem is an easy problem", "pro");
        assertEquals(2, actual);
    }

    @Test
    void isPrefixOfWor3() {
        int actual = solution.isPrefixOfWord("i am tired", "you");
        assertEquals(-1, actual);
    }

    @Test
    void isPrefixOfWor4() {
        int actual = solution.isPrefixOfWord("hellohello hellohellohello", "ell");
        assertEquals(-1, actual);
    }
}