package easy.sequence;

import java.util.HashSet;
import java.util.Set;

/*
217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109*/
public class ContainsDuplicate {

    //Runtime 14 ms Beats 40.78%
    // Memory 58.68 MB Beats 25.68%
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);

        }
        return false;
    }

    //Runtime 20 ms Beats 23.20%
    //Memory 59.74 MB Beats 14.41%
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        return nums.length != set.size();
//    }


    //Solution 1 BruteForce .
    // Difficult O(n^2), this solution is not effective for large array
    // Result : падает с ошибкой Time Limit Exceeded
//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i <nums.length-1 ; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//                if(nums[i]==nums[j])return true;
//            }
//        }
//        return false;
//    }

    //Solution 2 Sorting.
    // Difficult O(n log n)
    // Result :
    // runtime 18 ms (Beats 36.88 of users with Java ),
    // memory 56,97 (Beats 31.69% with Java)
//    public boolean containsDuplicate(int[] nums) {
//     Arrays.sort(nums);
//        for (int i = 0; i <nums.length-1 ; i++) {
//            if(nums[i]==nums[i+1])return true;
//        }
//        return false;
//    }

    //Solution 3 using Set.
    // Result :
    // runtime 16 ms (Beats 40.92 of users with Java ),
    // memory 56,91 (Beats 31.69% with Java)
//    public boolean containsDuplicate(int[] nums) {
//    Set<Integer> integerSet=new HashSet<>();
//        for (int i = 0; i <nums.length ; i++) {
//            integerSet.add(nums[i]);
//        }
//        return nums.length!=integerSet.size();
//    }

    //Лучший вариант 3 решения, с проверкой есть ли уже элемент (необязательно добавлять все элементы)
    // Result :
    // runtime 11 ms
    // memory 54,96
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> integerSet = new HashSet<>();
//        for (int num : nums) {
//            if (integerSet.contains(num)) return true;
//            else
//                integerSet.add(num);
//        }
//        return false;
//    }

    //Solution 4
    // Result :
    // runtime 17 ms
    // memory 55,12
//    public boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> seen = new HashMap<>();
//        for (int num : nums) {
//            if (seen.containsKey(num) && seen.get(num) >= 1)
//                return true;
//            seen.put(num, seen.getOrDefault(num, 0) + 1);
//        }
//        return false;
//
//    }
}
