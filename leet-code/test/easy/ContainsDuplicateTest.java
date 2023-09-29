package easy;

import easy.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        ContainsDuplicate solution = new ContainsDuplicate();
        boolean actual = solution.containsDuplicate(new int[]{1, 2, 3, 1});
        assertEquals(true, actual);

        actual = solution.containsDuplicate(new int[]{1, 2, 3, 4});
        assertEquals(false, actual);

        actual = solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        assertEquals(true, actual);
    }
}