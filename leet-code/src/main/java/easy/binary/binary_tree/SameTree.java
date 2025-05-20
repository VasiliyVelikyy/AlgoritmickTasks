package easy.binary.binary_tree;

import common.domain.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
* 100. Same Tree
Easy
Topics
Companies
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
*
* Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
*
* Input: p = [1,2,3], q = [1,2,3]
Output: true

* Input: p = [1,2], q = [1,null,2]
Output: false
*
* Input: p = [1,2,1], q = [1,1,2]
Output: false
* */
public class SameTree {

    //queue
    //Other solution
    //Runtime 0 ms Beats 100.00%
    //Memory 41.13 MB Beats 54.24%
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> firstQueue = new LinkedList<>();
        Queue<TreeNode> secondQueue = new LinkedList<>();
        firstQueue.add(p);
        secondQueue.add(q);

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            var curOne = firstQueue.poll();
            var curTwo = secondQueue.poll();

            if (curOne == null && curTwo == null) {
                continue;
            }
            if (curOne == null || curTwo == null) {
                return false;
            }
            if (curOne.val != curTwo.val) {
                return false;
            }
            firstQueue.add(curOne.left);
            secondQueue.add(curTwo.left);
            firstQueue.add(curOne.right);
            secondQueue.add(curTwo.right);


        }
        return true;
    }

    //Other solution
    //Runtime 0 ms Beats 100.00%
    //Memory 41.58 MB Beats 11.76%
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null) return true;
//        if (p == null || q == null) return false;
//        else if (p.val != q.val) return false;
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }

}



