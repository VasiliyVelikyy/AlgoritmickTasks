package easy.array;

//35. Search Insert Position
/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104*/
public class SearchInsertPosition {

    //my solution
    //Runtime  0ms Beats 100.00%of users with Java
    //Memory 43.02MB Beats 77.00%of users with Java
    public int searchInsert(int[] nums, int target) {
        int missingIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && missingIndex == -1) missingIndex = i;
            if (nums[i] == target) return i;
        }
        if (missingIndex == -1) missingIndex = nums.length;
        return missingIndex;
    }
}
