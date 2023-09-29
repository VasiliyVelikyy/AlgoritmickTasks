package easy;

import easy.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        int expected = 2;
        int actual ;//= solution.removeDuplicates(new int[]{1, 1, 2});
      //  Assertions.assertEquals(expected, actual);

        expected = 5;
        actual = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        Assertions.assertEquals(expected, actual);
    }
}