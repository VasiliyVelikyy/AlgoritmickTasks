package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.TreeNodeCollectors.fromTreeNode;

class ConvertSortedArrayToBinarySearchTreeTest {
    ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

    @Test
    void sortedArrayToBST() {
        var nodesAnswer = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        var arrayAnswer = fromTreeNode(nodesAnswer);
        assertArrayEquals(new Integer[]{0, -10, 5, -3, 9}, arrayAnswer);
    }
}