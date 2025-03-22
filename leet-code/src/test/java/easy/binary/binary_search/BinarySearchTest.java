package easy.binary.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    void search() {
        var answer = binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        assertEquals(4, answer);

    }

    @Test
    void search2() {
        var answer = binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        assertEquals(-1, answer);
    }

    @Test
    void search3() {
        var answer = binarySearch.search(new int[]{5}, -5);
        assertEquals(-1, answer);
    }

    @Test
    void search4() {
        var answer = binarySearch.search(new int[]{2,5}, 5);
        assertEquals(1, answer);
    }
}