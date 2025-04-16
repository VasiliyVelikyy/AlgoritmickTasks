package easy.binary.binary_tree;

import common.domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
* 94. Binary Tree Inorder Traversal
Easy
Topics
Companies
Given the root of a binary tree, return the inorder traversal of its nodes' values.



Example 1:

Input: root = [1,null,2,3]

Output: [1,3,2]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,2,6,5,7,1,3,9,8]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]



Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100*/
public class BinaryTreeInorderTraversal {

    //other solution
    //Runtime 0 ms Beats 100.00%
    //Memory 41.86 MB Beats 27.81%
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recurs(result, root);
        return result;
    }

    private void recurs(List<Integer> result, TreeNode root) {
        if (root == null) return;
        else {
            recurs(result, root.left);
            result.add(root.val);
            recurs(result, root.right);
        }
    }
}
