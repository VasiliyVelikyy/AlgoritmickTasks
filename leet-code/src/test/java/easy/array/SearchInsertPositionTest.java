package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    SearchInsertPosition solution = new SearchInsertPosition();

    @Test
    void searchInsert() {
        int actual = solution.searchInsert(new int[]{1, 3, 5, 6}, 5);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void searchInsert2() {
        int actual = solution.searchInsert(new int[]{1, 3, 5, 6}, 2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void searchInsert3() {
        int actual = solution.searchInsert(new int[]{1, 3, 5, 6}, 7);
        int expected = 4;
        assertEquals(expected, actual);
    }
}