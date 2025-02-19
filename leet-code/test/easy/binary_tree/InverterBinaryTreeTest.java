package easy.binary_tree;

import domain.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

class InverterBinaryTreeTest {
    private final InverterBinaryTree inverterBinaryTree = new InverterBinaryTree();

    @Test
    void invertTree() {
        inverterBinaryTree.invertTree(generateThreeNode(new int[]{4, 2, 7, 1, 3, 6, 9}));
    }

    private TreeNode generateThreeNode(int[] ints) {

        if (ints.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(ints[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int idx = 1;

        while (!queue.isEmpty() && idx < ints.length) {
            TreeNode node = queue.poll();

            if (idx < ints.length) {
                node.left = new TreeNode(ints[idx]);
                queue.add(node.left);
            }
            idx++;

            if (idx < ints.length ) {
                node.right = new TreeNode(ints[idx]);
                queue.add(node.right);
            }
            idx++;
        }

        return root;
    }
}