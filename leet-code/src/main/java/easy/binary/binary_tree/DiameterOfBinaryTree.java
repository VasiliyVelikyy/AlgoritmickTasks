package easy.binary.binary_tree;

import common.domain.TreeNode;

/*
* Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not
* pass through the root.

The length of a path between two nodes is represented by the number of edges between them.



Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1


Constraints:

The number of nodes in the tree is in the range [1, 104].
-100 <= Node.val <= 100*/
public class DiameterOfBinaryTree {

    int max = 0;

    //other solution
    //Runtime 0 ms Beats 100.00%
    //Memory 44.46 MB Beats 92.04%
    public int diameterOfBinaryTree(TreeNode root) {
        recursive(root);
        return max;
    }

    private int recursive(TreeNode root) {
        if (root == null) return 0;
        int left = recursive(root.left);
        int right = recursive(root.right);

        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;

    }

    //other solution
    //Runtime 6 ms Beats 12.69%
    // Memory 44.47 MB Beats 92.04%
//    public int diameterOfBinaryTree(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        Map<TreeNode, Integer> deepMap = new HashMap<>();
//        int diameter = 0;
//
//        if (root != null) {
//            stack.push(root);
//        }
//
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.peek();
//
//            if (node.left != null && !deepMap.containsKey(node.left)) {
//                stack.push(node.left);
//            } else if (node.right != null && !deepMap.containsKey(node.right)) {
//                stack.push(node.right);
//            } else {
//                stack.pop();
//
//                int leftDeep = deepMap.getOrDefault(node.left, 0);
//                int rightDeep = deepMap.getOrDefault(node.right, 0);
//                deepMap.put(node, 1 + Math.max(leftDeep, rightDeep));
//
//                diameter = Math.max(diameter, leftDeep + rightDeep);
//            }
//        }
//
//        return diameter;
//    }

}
