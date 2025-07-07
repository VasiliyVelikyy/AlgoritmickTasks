package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.TreeNodeCollectors.fromIntArrayWithNullValue;

class MinimumDepthOfBinaryTreeTest {
    MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

    @Test
    void minDepth() {
        var nodes = fromIntArrayWithNullValue(new Integer[] {3, 9, 20, null, null, 15, 7});
        var actual = solution.minDepth(nodes);
        assertEquals(2, actual);
    }

    @Test
    void minDepth2() {
        var nodes = fromIntArrayWithNullValue(new Integer[] {2,null,3,null,4,null,5,null,6});
        var actual = solution.minDepth(nodes);
        assertEquals(5, actual);
    }
}