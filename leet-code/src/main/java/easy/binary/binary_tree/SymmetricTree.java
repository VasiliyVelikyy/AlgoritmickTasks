package easy.binary.binary_tree;

import common.domain.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

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

    //My solution
    //Runtime 1 ms Beats 12.96%
    //Memory 42.48 MB Beats 6.59%
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queueOne = new LinkedList<>();
        Queue<TreeNode> queueTwo = new LinkedList<>();

        queueOne.add(root);
        queueTwo.add(root);

        while (!queueOne.isEmpty() && !queueTwo.isEmpty()) {
            var curNodeOne = queueOne.poll();
            var curNodeTwo = queueTwo.poll();


            if (curNodeOne == null && curNodeTwo == null) {
                continue;
            }

            if (curNodeOne == null || curNodeTwo == null) {
                return false;
            }

            if (curNodeOne.val != curNodeTwo.val) {
                return false;
            }

            queueOne.add(curNodeOne.left);
            queueTwo.add(curNodeTwo.right);

            queueOne.add(curNodeOne.right);
            queueTwo.add(curNodeTwo.left);

        }
        return true;
    }
}
