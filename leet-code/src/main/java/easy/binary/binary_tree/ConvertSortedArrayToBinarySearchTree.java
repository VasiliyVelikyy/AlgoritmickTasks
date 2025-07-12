package easy.binary.binary_tree;

import common.domain.TreeNode;


/*
* 108. Convert Sorted Array to Binary Search Tree
Easy
Topics
premium lock icon
Companies
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.



Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
* */
public class ConvertSortedArrayToBinarySearchTree {

    //Other solution
    //Runtime 0 ms Beats 100.00%
    //Memory 43.17 MB Beats 73.45%
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return constructNode(nums, 0, nums.length - 1);
    }

    private TreeNode constructNode(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = constructNode(nums, left, mid - 1);
        node.right = constructNode(nums, mid + 1, right);
        return node;
    }

}
