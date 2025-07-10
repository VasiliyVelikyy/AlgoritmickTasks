package easy.binary.binary_tree;

import common.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
* 144. Binary Tree Preorder Traversal
Easy
Topics
premium lock icon
Companies
Given the root of a binary tree, return the preorder traversal of its nodes' values.



Example 1:

Input: root = [1,null,2,3]

Output: [1,2,3]
* Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [1,2,4,5,6,7,3,8,9]

Explanation:
*
* Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]
* Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100


Follow up: Recursive solution is trivial, could you do it iteratively?*/
public class BinaryTreePreorderTraversal {

    //My solution
    //Runtime 0 ms Beats 100.00%
    //Memory 41.89 MB Beats 27.44%
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }


    //My solution
    //Runtime 0 ms Beats 100.00%
    //Memory 41.75 MB Beats 44.49%
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root == null) return new ArrayList<>();
//        List<Integer> result = new ArrayList<>();
//        addValue(root, result);
//        return result;
//    }
//
//    private void addValue(TreeNode root, List<Integer> result) {
//        if (root == null) return;
//        result.add(root.val);
//        addValue(root.left, result);
//        addValue(root.right, result);
//    }
}

