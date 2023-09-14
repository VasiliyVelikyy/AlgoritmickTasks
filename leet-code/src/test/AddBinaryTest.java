package test;

import easy.AddBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void addBinary() {
        AddBinary solution = new AddBinary();
        String actual = solution.addBinary("11", "1");
        String expected = "100";
        assertEquals(expected, actual);

        actual = solution.addBinary("1010", "1011");
        expected = "10101";
        assertEquals(expected, actual);

        actual = solution.addBinary("0", "0");
        expected = "0";
        assertEquals(expected, actual);


        actual = solution.addBinary("1", "111");
        expected = "1000";
        assertEquals(expected, actual);

        actual = solution.addBinary("1111", "1111");
        expected = "11110";
        assertEquals(expected, actual);
    }
}