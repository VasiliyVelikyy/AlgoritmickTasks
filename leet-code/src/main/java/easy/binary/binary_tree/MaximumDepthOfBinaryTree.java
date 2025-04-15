package easy.binary.binary_tree;

import common.domain.TreeNode;

/*
* 104. Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100*/
public class MaximumDepthOfBinaryTree {

    //my solution
    //Runtime 0 ms Beats 100.00%
    //Memory 42.74 MB Beats 48.77%
    public int maxDepth(TreeNode root) {
        return recursion(root);
    }

    private int recursion(TreeNode root) {
        if (root == null) return 0;
        int left = recursion(root.left);
        int right = recursion(root.right);
        return Math.max(left, right) + 1;
    }


    //my solution
    //Runtime 7 ms Beats 0.75%
    //Memory 43.02 MB Beats 17.38%
//    public int maxDepth(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        Map<TreeNode, Integer> map = new HashMap<>();
//        if (root == null) return 0;
//
//        stack.push(root);
//        int maxDepth = 0;
//
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.peek();
//
//            if (node.left != null && !map.containsKey(node.left)) {
//                stack.push(node.left);
//            } else if (node.right != null && !map.containsKey(node.right)) {
//                stack.push(node.right);
//            } else {
//                stack.pop();
//
//                int leftDepth = map.getOrDefault(node.left, 0);
//                int rightDepth = map.getOrDefault(node.right, 0);
//
//                map.put(node, 1 + Math.max(leftDepth, rightDepth));
//
//                maxDepth = Math.max(maxDepth, map.get(node));
//            }
//        }
//        return maxDepth;
//    }
}
