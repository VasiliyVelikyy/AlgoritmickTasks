package medium.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixEvalTest {
    MatrixEval solution = new MatrixEval();

    @Test
    void updateMatrix() {
        var testVal = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        var expected = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        var actual = solution.updateMatrix(testVal);
        assertArrayEquals(expected, actual);
    }

    @Test
    void updateMatrix2() {
        var testVal = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };

        var expected = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };
        var actual = solution.updateMatrix(testVal);
        assertArrayEquals(expected, actual);
    }
}