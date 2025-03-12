package easy.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FloodFillTest {

    FloodFill floodFill = new FloodFill();

    @Test
    void floodFill() {
        var expected = new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        var answer = floodFill.floodFill(new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        }, 1, 1, 2);

        assertArrayEquals(expected, answer);
    }

    @Test
    void floodFill2() {
        var expected = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        var answer = floodFill.floodFill(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, 0, 0, 0);

        assertArrayEquals(expected, answer);
    }
}