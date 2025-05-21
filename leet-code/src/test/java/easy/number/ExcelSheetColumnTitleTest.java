package easy.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnTitleTest {
    ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    @Test
    void convertToTitle() {
        assertEquals("A", solution.convertToTitle(1));
    }

    @Test
    void convertToTitle2() {
        assertEquals("Z", solution.convertToTitle(26));
    }

    @Test
    void convertToTitle3() {
        assertEquals("AA", solution.convertToTitle(27));
    }

    @Test
    void convertToTitle4() {
        assertEquals("AB", solution.convertToTitle(28));
    }

    @Test
    void convertToTitle5() {
        assertEquals("ZY", solution.convertToTitle(701));
    }
}