package easy.binary.binary_tree;

import common.domain.TreeNode;

import java.util.Stack;

/*
* 101. Symmetric Tree
Easy
Topics
Companies
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).



Example 1:
* Input: root = [1,2,2,3,4,4,3]
Output: true
*
* Input: root = [1,2,2,null,3,null,3]
Output: false
*
* Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100


Follow up: Could you solve it both recursively and iteratively?*/
public class SymmetricTree {

    //Other solution iterative
    //Runtime 1 ms Beats 12.96%
    //Memory 42.36 MB Beats 6.59%
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode left, right;
        if (root.left != null) {
            if (root.right == null) return false;
            stack.push(root.left);
            stack.push(root.right);
        } else if (root.right != null) {
            return false;
        }

        while (!stack.empty()) {
            if (stack.size() % 2 != 0) return false;
            right = stack.pop();
            left = stack.pop();
            if (right.val != left.val) return false;

            if (left.left != null) {
                if (right.right == null) return false;
                stack.push(left.left);
                stack.push(right.right);
            } else if (right.right != null) {
                return false;
            }

            if (left.right != null) {
                if (right.left == null) return false;
                stack.push(left.right);
                stack.push(right.left);
            } else if (right.left != null) {
                return false;
            }
        }

        return true;
    }


    //My solution recursive
    //Runtime 0 ms Beats 100.00%
    //Memory 41.75 MB Beats 69.02%
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        return isSymBranch(root.left, root.right);
//    }
//
//    private boolean isSymBranch(TreeNode left, TreeNode right) {
//        if (left == null && right == null) return true;
//        if (left == null || right == null) return false;
//        if (left.val != right.val) return false;
//        return isSymBranch(left.left, right.right) && isSymBranch(left.right, right.left);
//    }

    //My solution iterative
    //Runtime 1 ms Beats 12.96%
    //Memory 42.48 MB Beats 6.59%
//    public boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> queueOne = new LinkedList<>();
//        Queue<TreeNode> queueTwo = new LinkedList<>();
//
//        queueOne.add(root);
//        queueTwo.add(root);
//
//        while (!queueOne.isEmpty() && !queueTwo.isEmpty()) {
//            var curNodeOne = queueOne.poll();
//            var curNodeTwo = queueTwo.poll();
//
//
//            if (curNodeOne == null && curNodeTwo == null) {
//                continue;
//            }
//
//            if (curNodeOne == null || curNodeTwo == null) {
//                return false;
//            }
//
//            if (curNodeOne.val != curNodeTwo.val) {
//                return false;
//            }
//
//            queueOne.add(curNodeOne.left);
//            queueTwo.add(curNodeTwo.right);
//
//            queueOne.add(curNodeOne.right);
//            queueTwo.add(curNodeTwo.left);
//
//        }
//        return true;
//    }
}
