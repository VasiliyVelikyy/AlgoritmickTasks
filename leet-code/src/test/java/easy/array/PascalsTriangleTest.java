package easy.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {
    PascalsTriangle solution = new PascalsTriangle();

    @Test
    void generate() {
        List<List<Integer>> expected = new ArrayList<>() {{
            add(List.of(1));
            add(List.of(1, 1));
            add(List.of(1, 2, 1));
            add(List.of(1, 3, 3, 1));
            add(List.of(1, 4, 6, 4, 1));
        }};
        var actual = solution.generate(5);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void generate2() {
        List<List<Integer>> expected = new ArrayList<>() {{
            add(List.of(1));
        }};
        var actual = solution.generate(1);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}