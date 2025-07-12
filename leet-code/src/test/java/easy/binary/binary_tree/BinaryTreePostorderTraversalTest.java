package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.TreeNodeCollectors.fromIntArrayWithNullValue;

class BinaryTreePostorderTraversalTest {
    BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();

    @Test
    void postorderTraversal() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{1, null, 2, 3});
        var result = solution.postorderTraversal(nodes);
        assertArrayEquals(new Integer[]{3, 2, 1}, result.toArray());
    }

    @Test
    void postorderTraversa2() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9});
        var result = solution.postorderTraversal(nodes);
        assertArrayEquals(new Integer[]{4, 6, 7, 5, 2, 9, 8, 3, 1}, result.toArray());
    }

    @Test
    void postorderTraversa3() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{});
        var result = solution.postorderTraversal(nodes);
        assertArrayEquals(new Integer[]{}, result.toArray());
    }

    @Test
    void postorderTraversa4() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{1});
        var result = solution.postorderTraversal(nodes);
        assertArrayEquals(new Integer[]{1}, result.toArray());
    }

    @Test
    void postorderTraversa5() {
        var nodes = fromIntArrayWithNullValue(new Integer[]{1,-2,3,1,3,-2,null,-1});
        var result = solution.postorderTraversal(nodes);
        assertArrayEquals(new Integer[]{-1,1,3,-2,-2,3,1}, result.toArray());
    }
}