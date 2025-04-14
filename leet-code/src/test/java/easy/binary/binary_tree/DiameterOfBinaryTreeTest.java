package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.TreeNodeCollectors.fromIntArray;

class DiameterOfBinaryTreeTest {
    DiameterOfBinaryTree solution = new DiameterOfBinaryTree();

    @Test
    void diameterOfBinaryTree() {
        var treeNodes = fromIntArray(new Integer[]{1, 2, 3, 4, 5});
        var actual = solution.diameterOfBinaryTree(treeNodes);
        assertEquals(3, actual);

    }
}