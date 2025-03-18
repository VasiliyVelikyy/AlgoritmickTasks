package easy.array;

//905. Sort Array By Parity
/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000*/
public class SortArrayByParity {
    //my solution
    //Runtime 29ms Beats 5.04%of users with Java
    //Memory 44.04MB Beats 51.94%of users with Java
//    public int[] sortArrayByParity(int[] nums) {
//        int temp = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                for (int j = i; j >0 ; j--) {
//                    temp = nums[j];
//                    nums[j] = nums[j - 1];
//                    nums[j - 1] = temp;
//                }
//            }
//        }
//        return nums;
//    }

    //my solution Runtime
    //Runtime 5ms Beats 8.89%of users with Java
    //Memory 44.56MB Beats 13.84%of users with Java
//    public int[] sortArrayByParity(int[] nums) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                linkedList.addFirst(nums[i]);
//            } else linkedList.addLast(nums[i]);
//        }
//        return linkedList.stream().mapToInt(i -> i).toArray();
//    }


    //my solution
    //Runtime 1ms Beats 81.28%of users with Java
    //Memory 44.73MB Beats 6.93%of users with Java
//    public int[] sortArrayByParity(int[] nums) {
//        int indexCountEven = 0;
//        int indexCountNotEven = 0;
//        int[] indexesEven = new int[nums.length];
//        int[] indexesNotEven = new int[nums.length];
//        int[] result = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                indexesEven[indexCountEven] = nums[i];
//                indexCountEven++;
//            } else {
//                indexesNotEven[indexCountNotEven] = nums[i];
//                indexCountNotEven++;
//
//            }
//        }
//        System.arraycopy(indexesEven, 0, result, 0, indexCountEven);
//        System.arraycopy(indexesNotEven, 0, result, indexCountEven, indexCountNotEven);
//        return result;
//    }

    //other solution
    //Runtime  1ms Beats 81.28%of users with Java
    //Memory 44.27MB Beats 33.59%of users with Java
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex++;
            } else {
                result[oddIndex] = num;
                oddIndex--;
            }
        }
        // The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted. But the unit test needs to be changed
        return result;
    }
}