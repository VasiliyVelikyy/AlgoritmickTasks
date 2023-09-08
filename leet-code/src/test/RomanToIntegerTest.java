package test;

import easy.RomanToInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RomanToIntegerTest {

    @Test
    void romanToInt() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int expected = 3;
        int actual = romanToInteger.romanToInt("III");
        Assertions.assertEquals(expected, actual);

        expected = 58;
        actual = romanToInteger.romanToInt("LVIII");
        Assertions.assertEquals(expected, actual);

        expected = 1994;
        actual = romanToInteger.romanToInt("MCMXCIV");
        Assertions.assertEquals(expected, actual);

        expected = 3999;
        actual = romanToInteger.romanToInt("MMMCMXCIX");
        Assertions.assertEquals(expected, actual);
    }
}