package easy.array;

/*
26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.

*/
public class RemoveDuplicatesFromSortedArray {
//    public int removeDuplicates(int[] nums) {
//        Set<Integer>set=new HashSet<>();
//        int count=0;
//        for (int i = 0; i < nums.length; i++) {
//            if(!set.contains(nums[i])){
//                count++;
//                set.add(nums[i]);
//            }
//            for (int j = i+1; j < nums.length;) {
//                if(nums[i]==nums[j] && j<nums.length-count){
//                    for (int k = j; k <nums.length-1 ; k++) {
//                        int temp=nums[k];
//                        nums[k]=nums[k+1];
//                        nums[k+1]=temp;
//                    }
//                }
//                else j++;
//            }
//        }
//        return count;
//
//    }

    //Runtime 10ms Beats 5.39%of users with Java
    //Memory 46.91MB Beats 5.58%of users with Java
//    public int removeDuplicates(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int[] sortArray = set.stream().sorted().mapToInt(Number::intValue).toArray();
//        for (int i = 0; i < sortArray.length; i++) {
//            nums[i] = sortArray[i];
//        }
//        return set.size();
//    }

//Runtime 1ms Beats 97.29%of users with Java
//Memory 44.14MB Beats 17.15%of users with Java
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
