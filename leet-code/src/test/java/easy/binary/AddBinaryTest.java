package easy.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddBinaryTest {

    AddBinary solution = new AddBinary();

    @Test
    void addBinary() {
        String actual = solution.addBinary("11", "1");
        String expected = "100";
        assertEquals(expected, actual);
    }

    @Test
    void addBinary2() {
        String actual = solution.addBinary("1010", "1011");
        String expected = "10101";
        assertEquals(expected, actual);
    }

    @Test
    void addBinary3() {
        String actual = solution.addBinary("0", "0");
        String expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    void addBinary4() {
        String actual = solution.addBinary("1", "111");
        String expected = "1000";
        assertEquals(expected, actual);
    }

    @Test
    void addBinary5() {
        String actual = solution.addBinary("1111", "1111");
        String expected = "11110";
        assertEquals(expected, actual);
    }
}