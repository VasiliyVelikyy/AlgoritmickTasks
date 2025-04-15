package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.TreeNodeCollectors.fromIntArrayWithNullValue;

class MaximumDepthOfBinaryTreeTest {

    MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

    @Test
    void maxDepth() {
        var treeNodes = fromIntArrayWithNullValue(new Integer[]{3, 9, 20, null, null, 15, 7});
        int actual = solution.maxDepth(treeNodes);
        assertEquals(3, actual);
    }

    @Test
    void maxDepth2() {
        var treeNodes = fromIntArrayWithNullValue(new Integer[]{1, null, 2});
        int actual = solution.maxDepth(treeNodes);
        assertEquals(2, actual);
    }

    @Test
    void maxDepth3() {
        var treeNodes = fromIntArrayWithNullValue(new Integer[]{1, 3, 2});
        int actual = solution.maxDepth(treeNodes);
        assertEquals(2, actual);
    }
}