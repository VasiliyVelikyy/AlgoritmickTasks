package easy.binary.binary_tree;

import common.domain.TreeNode;

import java.util.Stack;

/*
* 112. Path Sum
Easy
Topics
premium lock icon
Companies
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.



Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There are two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
Example 3:

Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.


Constraints:

The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
* */
public class PathSum {

    //Other solution
    //Runtime 2 ms Beats 5.91%
    //Memory 43.45 MB Beats 25.86%
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        nodeStack.push(root);
        sumStack.push(targetSum - root.val);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int currentSum = sumStack.pop();

            if (node.left == null && node.right == null && currentSum == 0) {
                return true;
            }

            if (node.right != null) {
                nodeStack.push(node.right);
                sumStack.push(currentSum - node.right.val);
            }
            if (node.left != null) {
                nodeStack.push(node.left);
                sumStack.push(currentSum - node.left.val);
            }
        }
        return false;
    }


    //Other Solution
    //Runtime 0 ms Beats 100.00%
    //Memory 43.07 MB Beats 77.43%
//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null) return false;
//        sum -= root.val;
//        if (root.left == null && root.right == null)
//            return sum == 0;
//        return
//                hasPathSum(root.left, sum) || //
//                        hasPathSum(root.right, sum);
//    }
}
