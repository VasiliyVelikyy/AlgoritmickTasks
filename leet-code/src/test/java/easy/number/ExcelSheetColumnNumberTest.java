package easy.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberTest {
    ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();

    @Test
    void titleToNumber() {
       var actual= solution.titleToNumber("A");
       assertEquals(1, actual);
    }

    @Test
    void titleToNumber2() {
        var actual= solution.titleToNumber("AB");
        assertEquals(28, actual);
    }

    @Test
    void titleToNumber3() {
        var actual= solution.titleToNumber("ZY");
        assertEquals(701, actual);
    }
}