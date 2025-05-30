package easy.array;

/*1920. Build Array from Permutation
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).


Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
Example 2:

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]


Constraints:

1 <= nums.length <= 1000
0 <= nums[i] < nums.length
The elements in nums are distinct.


Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?*/
public class BuildArrayFromPermutation {

    //My solution
    //Runtime 1 ms Beats 98.72%
    //Memory 45.74 MB Beats 7.75%
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0, j = 0; i < nums.length; i++, j++) {
            ans[j] = nums[nums[i]];
        }
        return ans;
    }
//    public int[] buildArray(List<Integer> nums) {
//        int q = nums.size();
//
//        // turn the array into a=qb+r
//        for (int i = 0; i < nums.size(); i++) {
//            int r = nums.get(i);
//
//            // retrieve correct value from potentially already processed element
//            // i.e. get r from something maybe already in the form a = qb + r
//            // if it isn't already processed (doesn't have qb yet), that's ok b/c
//            // r < q, so r % q will return the same value
//            int b = nums.get(nums.get(i)) % q;
//
//            // put it all together
//            nums.set(i, q * b + r);
//        }
//
//        // extract just the final b values
//        for (int i = 0; i < nums.size(); i++) {
//            nums.set(i, nums.get(i) / q);
//        }
//
//        return nums;
//    }

}
