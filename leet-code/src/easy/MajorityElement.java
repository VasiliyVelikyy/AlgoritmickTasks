package easy;

import java.util.*;
import java.util.stream.Collectors;

/*169. Majority Element
 Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109

Follow-up: Could you solve the problem in linear time and in O(1) space?
 * */
public class MajorityElement {
//    public int majorityElement(int[] nums) {
//      HashMap<Integer,Integer>map=new HashMap<>();
//        for (int current:nums){
//                map.put(current,map.getOrDefault(current,0)+1);
//        }
//         int max= map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
//        return max;
//    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }


}
