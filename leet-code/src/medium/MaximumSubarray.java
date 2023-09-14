package medium;

import java.util.ArrayList;
import java.util.List;

//53. Maximum Subarray
/*Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.*/
public class MaximumSubarray {
    //главная идея в том что как только текущая сумма уходит в отрицательное значение, макс суммой становиться любое положительное число
    //other solution
    //Runtime 1ms Beats 100.00%of users with Java
    //Memory 57.63MB Beats 86.99%of users with Java
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int maxSum = nums[0];
        int currentSum = Math.max(0, maxSum);

        for (int i = 1; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) currentSum = 0;
        }
        return maxSum;
    }
}
