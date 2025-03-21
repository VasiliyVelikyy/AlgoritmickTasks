package easy.array;

import java.util.HashMap;
import java.util.Map;

/* 1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?*/
public class TwoSum {

    //Solution 1:(Brute Force)
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            int missingNum = target - nums[i];
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (missingNum == nums[j]) return new int[]{i, j};
//                }
//        }
//        return new int[]{};
//    }

    //Solution 2: (Two-pass Hash Table)
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numMap = new HashMap<>();
//        int n = nums.length;
//
//        // Build the hash table
//        for (int i = 0; i < n; i++) {
//            numMap.put(nums[i], i);
//        }
//
//        // Find the complement
//        for (int i = 0; i < n; i++) {
//            int missingNum = target - nums[i];
//            if (numMap.containsKey(missingNum) && numMap.get(missingNum) != i) {
//                return new int[]{i, numMap.get(missingNum)};
//            }
//        }
//
//        return new int[]{}; // No solution found
//    }

    //Solution 3: (One-pass Hash Table)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int missingNum = target - nums[i];
            if (numMap.containsKey(missingNum)) {
                return new int[]{numMap.get(missingNum), i};
            } else numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}