package easy.chars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadNCharacterGivenReadFourTest {
    ReadNCharacterGivenReadFour solution = new ReadNCharacterGivenReadFour();

    @Test
    void read() {
        var actual = solution.read(new char[] {'a', 'b', 'c'}, 4);
        assertEquals(3, actual);
    }

    @Test
    void read2() {
        var actual = solution.read(new char[] {'a', 'b', 'c', 'd', 'e'}, 5);
        assertEquals(5, actual);
    }

    @Test
    void read3() {
        var actual = solution.read(new char[] {'a', 'b', 'c', 'd', 'A', 'B', 'C', 'D', '1', '2', '3', '4'},
                                   12);
        assertEquals(12, actual);
    }

    @Test
    void read4() {
        var actual = solution.read(new char[] {'l', 'e', 'e', 't', 'c', 'o', 'd', 'e'},
                                   5);
        assertEquals(5, actual);
    }
}