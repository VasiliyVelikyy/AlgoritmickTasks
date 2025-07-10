package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.TreeNodeCollectors.fromIntArrayWithNullValue;

class BinaryTreePreorderTraversalTest {
    BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    @Test
    void preorderTraversal() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{1, null, 2, 3});
        var list = solution.preorderTraversal(nodes);
        assertArrayEquals(new Integer[]{1, 2, 3}, list.toArray());
    }

    @Test
    void preorderTraversal2() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9});
        var list = solution.preorderTraversal(nodes);
        assertArrayEquals(new Integer[]{1, 2, 4, 5, 6, 7, 3, 8, 9}, list.toArray());
    }
}