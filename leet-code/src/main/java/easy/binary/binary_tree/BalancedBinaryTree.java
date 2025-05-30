package easy.binary.binary_tree;

import common.domain.TreeNode;

/*110. Balanced Binary Tree
Easy
Topics
Companies
Given a binary tree, determine if it is height-balanced.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true


Constraints:

The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104*/
public class BalancedBinaryTree {

    //other solution
    //Runtime 0 ms Beats 100.00%
    // Memory 44.23 MB Beats 85.05%
    public boolean isBalanced(TreeNode root) {
        // If the tree is empty, we can say it’s balanced...
        if (root == null)  return true;
        // Height Function will return -1, when it’s an unbalanced tree...
        return height(root) != -1;
    }
    // Create a function to return the “height” of a current subtree using recursion...
    private int height(TreeNode root) {
        // Base case...
        if (root == null)  return 0;
        // Height of left subtree...
        int leftHeight = height(root.left);
        // Height of height subtree...
        int rightHight = height(root.right);
        // In case of left subtree or right subtree unbalanced, return -1...
        if (leftHeight == -1 || rightHight == -1)  return -1;
        // If their heights differ by more than ‘1’, return -1...
        if (Math.abs(leftHeight - rightHight) > 1)  return -1;
        // Otherwise, return the height of this subtree as max(leftHeight, rightHight) + 1...
        return Math.max(leftHeight, rightHight) + 1;
    }


    //other solution
    //Runtime 0 ms Beats 100.00%
    // Memory 44.72 MB Beats 22.70%
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) return true;
//        else {
//            int left = getMaxSubtreeHeight(root.left);
//            int right = getMaxSubtreeHeight(root.right);
//            return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//        }
//    }
//
//    private int getMaxSubtreeHeight(TreeNode node) {
//        if (node == null) return 0;
//        else {
//            return 1 + Math.max(getMaxSubtreeHeight(node.left), getMaxSubtreeHeight(node.right));
//        }
//    }
}
