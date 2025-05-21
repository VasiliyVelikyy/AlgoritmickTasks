package easy.array;


/*
* 136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1



Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.*/
public class SingleNumber {

    //Other solution  XOR operator
    //Runtime 1 ms Beats 99.93%
    //Memory 46.89 MB Beats 5.45%
    /*A B RES
      0 0 0
      0 1 1
      1 0 1
      1 1 0
      */
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            ans ^= x;
        }
        return ans;
    }

    //Other solution arraysum
    //Runtime 9 ms Beats 25.16%
    //Memory 45.22 MB Beats 88.39%
//    public int singleNumber(int[] nums) {
//        Set<Integer>set = new HashSet<>();
//        //a(x) представляет x-й уникальный элемент в массиве.
//        //a(k+1) представляет элемент с частотой = 1.
//        int arraySum=0; //ARRAY_SUM = 2*(a1+a2+a3...+ak) + a(k+1)
//        int setSum=0;//SET_SUM = 2*(a1+a2+a3+....+ak+ a(k+1))
//        for (int num : nums){
//            if(!set.contains(num)){
//                setSum+=num;
//                set.add(num);
//            }
//            arraySum+=num;
//        }
//        return 2*setSum-arraySum;
//
//    }
    //Other solution sorting method
    // TC: O(NlogN) SC: O(1)
    //Runtime
    //6
    //ms Beats 32.06%
    //Memory 46.15 MB Beats 59.72%
//    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i += 2) {
//            if (nums[i] != nums[i - 1]) {
//                return nums[i - 1];
//            }
//        }
//        return nums[nums.length - 1];
//    }

    //My solution
    //Runtime 12 ms Beats 22.74%
    //Memory 44.63 MB Beats 99.10%
//    public int singleNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : nums) {
//            if (!set.contains(num)) {
//                set.add(num);
//            } else {
//                set.remove(num);
//            }
//        }
//        return set.iterator().next();
//    }

    //My solution
    //Runtime 13 ms Beats 19.30%
    //Memory 45.55 MB Beats 83.85%
    //TC: O(N) SC: O(N)
//    public int singleNumber(int[] nums) {
//        Map<Integer, Integer>map=new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//        return -1;
//    }
}
