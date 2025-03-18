package easy.array;

//896. Monotonic Array
/*An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.



Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false


Constraints:

1 <= nums.length <= 105MonotonicArray
-105 <= nums[i] <= 105*/
public class MonotonicArray {
    //my solution
    //Runtime 1ms Beats 99.82%of users with Java
    //Memory 55.00MB Beats 91.70%of users with Java
    public boolean isMonotonic(int[] nums) {
        boolean desc = false;
        boolean asc = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (!desc && !asc) { //определить какая должна быть последователность по неравным рядом лежащим элементам
                if (nums[i] == nums[i + 1]) continue;
                else if (nums[i] > nums[i + 1]) desc = true;
                else asc = true;
            } else if ((desc && nums[i] >= nums[i + 1]) || (asc && nums[i] <= nums[i + 1]))
                continue;
            else
                return false;
        }
        return true;
    }
}
