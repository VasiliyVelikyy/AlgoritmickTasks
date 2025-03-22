package easy.array;

import java.util.HashMap;
import java.util.Map;

//задача странная, в условии сказано что большинство обязательно равно вхождению ⌊n / 2⌋
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

    //Other solution
    //Runtime 12 ms Beats 36.07%
    //Memory 50.16 MB Beats 71.37%
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }

    //My solution
    //Runtime 16 ms Beats 18.46%
    //Memory 49.69 MB Beats 79.49%
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        var list = map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder() ))
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//        return list.get(0);
//    }

    //My solution
    //Runtime 15 msBeats22.74%
    //Memory 49.80 MB Beats 74.81%
//    public int majorityElement(int[] nums) {
//      HashMap<Integer,Integer>map=new HashMap<>();
//        for (int current:nums){
//                map.put(current,map.getOrDefault(current,0)+1);
//        }
//         int max= map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
//        return max;
//    }


//    public int majorityElement(int[] nums) {
//        int count = 0;
//        int candidate = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//        return candidate;
//    }


    //Runtime 4 ms Beats 51.62%
    //Memory 52.96 MB Beats 65.47%
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];
//    }


}
