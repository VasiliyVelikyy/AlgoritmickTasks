package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void romanToInt() {
        int expected = 3;
        int actual = romanToInteger.romanToInt("III");
        assertEquals(expected, actual);
    }

    @Test
    void romanToInt2() {
        int expected = 58;
        int actual = romanToInteger.romanToInt("LVIII");
        assertEquals(expected, actual);
    }

    @Test
    void romanToInt3() {
        int expected = 1994;
        int actual = romanToInteger.romanToInt("MCMXCIV");
        assertEquals(expected, actual);
    }

    @Test
    void romanToInt4() {
        int expected = 3999;
        int actual = romanToInteger.romanToInt("MMMCMXCIX");
        assertEquals(expected, actual);
    }


}