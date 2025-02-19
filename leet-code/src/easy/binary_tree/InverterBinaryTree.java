package easy.binary_tree;

import domain.TreeNode;

import java.util.LinkedList;

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

    //right solution
    //Runtime 0 ms Beats 100.00%
    // Memory 41.08 MB Beats 77.74%
    public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        // Base case: if the tree is empty...
        if (root != null) {
            // Push the root node...
            q.add(root);
        }
        // Loop till queue is empty...
        while (!q.isEmpty()) {
            // Dequeue front node...
            TreeNode temp = q.poll();
            // Enqueue left child of the popped node...
            if (temp.left != null)
                q.add(temp.left);
            // Enqueue right child of the popped node
            if (temp.right != null)
                q.add(temp.right);
            // Swapping process...
            TreeNode curr = temp.left;
            temp.left = temp.right;
            temp.right = curr;
        }
        return root;    // Return the root...
    }


    //my solution
    //Runtime 0 ms Beats 100.00%
    //Memory 41.43 MB Beats 24.28%
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null ) return null;
//        swapChildren(root);
//        return root;
//    }
//
//    private void swapChildren(TreeNode root) {
//        if (root == null || (root.left == null && root.right == null)) {
//            return;
//        }
//        var temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//
//        temp = root.right;
//        root = root.left;
//        swapChildren(root);
//        root = temp;
//        swapChildren(root);
//    }
}
