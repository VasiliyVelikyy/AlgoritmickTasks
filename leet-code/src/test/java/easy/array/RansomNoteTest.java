package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    RansomNote solution = new RansomNote();

    @Test
    void canConstruct() {
       var answer= solution.canConstruct("a","b");
       assertFalse(answer);
    }

    @Test
    void canConstruct2() {
        var answer= solution.canConstruct("aa","ab");
        assertFalse(answer);
    }

    @Test
    void canConstruct3() {
        var answer= solution.canConstruct("aa","aab");
        assertTrue(answer);
    }
}