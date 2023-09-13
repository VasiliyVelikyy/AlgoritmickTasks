package test;

import easy.SearchInsertPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        SearchInsertPosition solution = new SearchInsertPosition();
        int actual = solution.searchInsert(new int[]{1, 3, 5, 6}, 5);
        int expected = 2;
        assertEquals(expected, actual);

        actual = solution.searchInsert(new int[]{1, 3, 5, 6}, 2);
        expected = 1;
        assertEquals(expected, actual);

        actual = solution.searchInsert(new int[]{1, 3, 5, 6}, 7);
        expected = 4;
        assertEquals(expected, actual);
    }
}