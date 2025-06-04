package easy.binary.binary_tree;


import common.domain.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
111. Minimum Depth of Binary Tree
* Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5


Constraints:

The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000
*
*
*/
public class MinimumDepthOfBinaryTree {
    //my solution
    //Runtime 6 ms Beats 26.68%
    // Memory 63.19 MB Beats 71.61%
    // public int minDepth(TreeNode root) {
    //     return recursion(root);
    // }
    //
    // private int recursion(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int left = recursion(root.left);
    //     int right = recursion(root.right);
    //     if (left == 0 && right != 0) {
    //         return right + 1;
    //     } else if (right == 0 && left != 0) {
    //         return left + 1;
    //     }
    //     return Math.min(left, right) + 1;
    // }

    //Other solution
    //Runtime 2 ms Beats 87.09%
    // Memory 63.33 MB Beats 48.78%
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 0;
        while (!queue.isEmpty()) {
            i++;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                TreeNode currentNode = queue.poll();
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                if (currentNode.left == null && currentNode.right == null) {
                    return i;
                }
            }
        }
        return -1;
    }
}
