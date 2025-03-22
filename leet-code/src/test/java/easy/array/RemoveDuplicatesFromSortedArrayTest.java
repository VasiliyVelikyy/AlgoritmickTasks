package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates() {

        int expected = 2;
        int actual = solution.removeDuplicates(new int[]{1, 1, 2});
        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicates2() {
        int expected = 5;
        int actual = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        assertEquals(expected, actual);
    }
}