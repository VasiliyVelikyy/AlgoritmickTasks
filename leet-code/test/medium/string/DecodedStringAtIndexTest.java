package medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodedStringAtIndexTest {

    DecodedStringAtIndex solution = new DecodedStringAtIndex();

    @Test
    void decodeAtIndex() {
        String actual = solution.decodeAtIndex("leet2code3", 10);
        String expected = "o";
        assertEquals(expected, actual);
    }

    @Test
    void decodeAtIndex2() {
        String actual = solution.decodeAtIndex("ha22", 5);
        String expected = "h";
        assertEquals(expected, actual);

    }

    @Test
    void decodeAtIndex3() {
        String actual = solution.decodeAtIndex("a2345678999999999999999", 1);
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    void decodeAtIndex4() {
        String actual = solution.decodeAtIndex("a23", 6);
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    void decodeAtIndex5() {
        String actual = solution.decodeAtIndex("y959q969u3hb22odq595", 222280369);
        String expected = "y";
        assertEquals(expected, actual);
    }
}