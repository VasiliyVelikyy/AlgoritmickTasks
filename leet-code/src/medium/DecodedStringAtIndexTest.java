package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodedStringAtIndexTest {

    @Test
    void decodeAtIndex() {
        DecodedStringAtIndex solution = new DecodedStringAtIndex();
        String actual= solution.decodeAtIndex("leet2code3", 10);
        String expected = "o";
        assertEquals(expected, actual);

        actual = solution.decodeAtIndex("ha22", 5);
        expected = "h";
        assertEquals(expected, actual);

        actual = solution.decodeAtIndex("a2345678999999999999999", 1);
        expected = "a";
        assertEquals(expected, actual);

        actual = solution.decodeAtIndex("a23", 6);
        expected = "a";
        assertEquals(expected, actual);

        actual = solution.decodeAtIndex("y959q969u3hb22odq595", 222280369);
        expected = "y";
        assertEquals(expected, actual);
    }
}