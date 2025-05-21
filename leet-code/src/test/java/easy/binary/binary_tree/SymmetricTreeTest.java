package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.TreeNodeCollectors.fromIntArrayWithNullValue;

class SymmetricTreeTest {
    SymmetricTree solution = new SymmetricTree();

    @Test
    void isSymmetric() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        var actual = solution.isSymmetric(nodes);
        assertTrue(actual);
    }

    @Test
    void isSymmetric2() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{1,2,2,null,3,null,3});
        var actual = solution.isSymmetric(nodes);
        assertFalse(actual);
    }
}