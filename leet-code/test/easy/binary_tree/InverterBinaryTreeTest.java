package easy.binary_tree;

import domain.TreeNode;
import easy.utils.TreeNodeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InverterBinaryTreeTest {
    private final InverterBinaryTree inverterBinaryTree = new InverterBinaryTree();

    @Test
    void invertTree1() {
        var expectedValue = new Integer[]{4, 7, 2, 9, 6, 3, 1};
        var actualNode = inverterBinaryTree.invertTree(TreeNodeUtils.fromIntArray(new Integer[]{4, 2, 7, 1, 3, 6, 9}));
        Integer[] actualValue = TreeNodeUtils.fromTreeNode(actualNode);
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void invertTree2() {
        var expectedValue = new Integer[]{2, 3, 1};
        var actualNode = inverterBinaryTree.invertTree(TreeNodeUtils.fromIntArray(new Integer[]{2, 1, 3}));
        Integer[] actualValue = TreeNodeUtils.fromTreeNode(actualNode);
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void invertTree3() {
        var expectedValue = new Integer[]{};
        var actualNode = inverterBinaryTree.invertTree(new TreeNode());
        Integer[] actualValue = TreeNodeUtils.fromTreeNode(actualNode);
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void invertTree4() {
        var expectedValue = new Integer[]{1, 2};
        var actualNode = inverterBinaryTree.invertTree(TreeNodeUtils.fromIntArray(expectedValue));
        Integer[] actualValue = TreeNodeUtils.fromTreeNode(actualNode);
        assertArrayEquals(expectedValue, actualValue);
    }

}