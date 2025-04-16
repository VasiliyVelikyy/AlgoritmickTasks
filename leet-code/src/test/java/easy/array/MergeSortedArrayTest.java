package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArrayTest {
    MergeSortedArray solution = new MergeSortedArray();

    @Test
    void merge() {
        var actual = new int[]{1, 2, 3, 0, 0, 0};
        solution.merge(actual, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, actual);
    }

    @Test
    void merge2() {
        var actual = new int[]{0};
        solution.merge(actual, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, actual);
    }

    @Test
    void merge3() {
        var actual = new int[]{1};
        solution.merge(actual, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, actual);
    }

    @Test
    void merge4() {
        var actual = new int[]{0, 0, 0, 0, 0};
        solution.merge(actual, 0, new int[]{1, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
    }

    @Test
    void merge5() {
        var actual = new int[]{2, 0};
        solution.merge(actual, 1, new int[]{1}, 1);
        assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    void merge6() {
        var actual = new int[]{4,0,0,0,0,0};
        solution.merge(actual, 1, new int[]{1,2,3,5,6}, 5);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, actual);
    }
}