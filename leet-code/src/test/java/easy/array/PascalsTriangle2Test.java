package easy.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangle2Test {

    PascalsTriangle2 solution = new PascalsTriangle2();

    @Test
    void getRow() {
        List<Integer> expected = List.of(1, 3, 3, 1);
        var actual = solution.getRow(3);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void getRow2() {
        List<Integer> expected = List.of(1);
        var actual = solution.getRow(0);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}