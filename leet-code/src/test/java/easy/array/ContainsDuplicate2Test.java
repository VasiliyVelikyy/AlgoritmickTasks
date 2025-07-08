package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicate2Test {
    ContainsDuplicate2 solution = new ContainsDuplicate2();

    @Test
    void containsNearbyDuplicate() {
        var actual = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        assertTrue(actual);
    }

    @Test
    void containsNearbyDuplicate2() {
        var actual = solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
        assertTrue(actual);
    }

    @Test
    void containsNearbyDuplicate3() {
        var actual = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
        assertFalse(actual);
    }
}