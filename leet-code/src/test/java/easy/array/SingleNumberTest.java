package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
    SingleNumber solution = new SingleNumber();

    @Test
    void singleNumber() {
        var actual = solution.singleNumber(new int[]{2, 2, 1});
        assertEquals(1, actual);
    }

    @Test
    void singleNumber2() {
        var actual = solution.singleNumber(new int[]{4, 1, 2, 1, 2});
        assertEquals(4, actual);
    }

    @Test
    void singleNumber3() {
        var actual = solution.singleNumber(new int[]{1});
        assertEquals(1, actual);
    }
}