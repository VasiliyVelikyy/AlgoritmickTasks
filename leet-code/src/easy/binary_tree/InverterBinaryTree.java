package easy.binary_tree;

import domain.TreeNode;

//226. Invert Binary Tree
//Easy
//Topics
//Companies
//Given the root of a binary tree, invert the tree, and return its root.
//
// Input: root = [4,2,7,1,3,6,9]
//Output: [4,7,2,9,6,3,1]
//Input: root = [2,1,3]
//Output: [2,3,1]
//Example 3:
//
//Input: root = []
//Output: []
//Constraints:
//
//The number of nodes in the tree is in the range [0, 100].
//-100 <= Node.val <= 100
public class InverterBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root.left == null || root.right == null) return new TreeNode();

        TreeNode answer = root;

        swapChildren(root);

        return answer;
    }

    private void swapChildren(TreeNode root) {
        if (root == null || root.left == null || root.right == null) {
            return;
        }
        var temp = root.left;
        root.left = root.right;
        root.right = temp;

        temp = root.right;
        root = root.left;
        swapChildren(root);
        root = temp;
        swapChildren(root);
    }
}
