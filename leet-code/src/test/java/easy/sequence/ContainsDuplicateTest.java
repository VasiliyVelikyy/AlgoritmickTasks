package easy.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {
    ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void containsDuplicate() {
        boolean actual = solution.containsDuplicate(new int[]{1, 2, 3, 1});
        assertTrue(actual);
    }

    @Test
    void containsDuplicate2() {
        boolean actual = solution.containsDuplicate(new int[]{1, 2, 3, 4});
        assertFalse(actual);
    }

    @Test
    void containsDuplicate3() {
        boolean actual = solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        assertTrue(actual);
    }

}