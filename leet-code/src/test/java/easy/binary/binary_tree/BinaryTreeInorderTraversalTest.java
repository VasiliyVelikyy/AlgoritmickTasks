package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static utils.TreeNodeCollectors.fromIntArrayWithNullValue;

class BinaryTreeInorderTraversalTest {
    BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

    @Test
    void inorderTraversal() {
        var expected = List.of(1,3,2);
        var actual = solution.inorderTraversal(fromIntArrayWithNullValue(new Integer[]{1,null,2,3}));
        assertIterableEquals(expected, actual);
    }

    @Test
    void inorderTraversal2() {
        var expected = List.of(4, 2, 6, 5, 7, 1, 3, 9, 8);
        var actual = solution.inorderTraversal(fromIntArrayWithNullValue(new Integer[]{1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9}));
        assertIterableEquals(expected, actual);
    }
}