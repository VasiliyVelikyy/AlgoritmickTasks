package easy.array;

import java.util.Comparator;
import java.util.PriorityQueue;

//2164. Sort Even and Odd Indices Independently
/*You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:

Sort the values at odd indices of nums in non-increasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
Sort the values at even indices of nums in non-decreasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
Return the array formed after rearranging the values of nums.



Example 1:

Input: nums = [4,1,2,3]
Output: [2,3,4,1]
Explanation:
First, we sort the values present at odd indices (1 and 3) in non-increasing order.
So, nums changes from [4,1,2,3] to [4,3,2,1].
Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
So, nums changes from [4,1,2,3] to [2,3,4,1].
Thus, the array formed after rearranging the values is [2,3,4,1].
Example 2:

Input: nums = [2,1]
Output: [2,1]
Explanation:
Since there is exactly one odd index and one even index, no rearrangement of values takes place.
The resultant array formed is [2,1], which is the same as the initial array.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100*/
public class SortEvenAndOddIndicesIndependently {

    //other solution
    //Runtime 3ms  70.10%of users with Java
    //Memory 44.14MB Beats 6.64%of users with Java
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> even = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        PriorityQueue<Integer> odd = new PriorityQueue<>((a, b)->(b - a));
        int length = nums.length;
        for (int i = 0; i < length; ++i) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        for (int i = 0; i < length; ++i) {
            if (i % 2 == 0) {
                nums[i] = even.poll();
            } else {
                nums[i] = odd.poll();
            }
        }
        return nums;
    }

    //other solution
    //Runtime 1ms Beats 100.00%of users with Java
    //Memory 43.95MB Beats 19.58%of users with Java
//    public int[] sortEvenOdd(int[] nums) {
//        int[] even = new int[101];
//        int[] odd = new int[101];
//        int length = nums.length;
//        for (int i = 0; i < length; ++i) {
//            if (i % 2 == 0) {
//                even[nums[i]]++;
//            } else {
//                odd[nums[i]]++;
//            }
//        }
//        int e = 0;
//        int o = 100;
//        for (int i = 0; i < length; ++i) {
//            if (i % 2 == 0) {
//                // check even
//                while (even[e] == 0) {
//                    ++e;
//                }
//                nums[i] = e;
//                even[e]--;
//            } else {
//                while(odd[o] == 0) {
//                    --o;
//                }
//                nums[i] = o;
//                odd[o]--;
//            }
//        }
//        return nums;
//    }




    ////my solution
    //Runtime 4ms Beats 54.90%of users with Java
    //Memory  43.44MB Beats 87.41%of users with Java
//    public int[] sortEvenOdd(int[] nums) {
//        //bubble sorting odd index
//        for (int out = nums.length - 1; out >= 1; out = out - 2) {
//            for (int in = 1; in < out; in = in + 2) {
//                if (in + 2<nums.length && nums[in] < nums[in + 2]) {
//                    int dummy = nums[in];
//                    nums[in] = nums[in + 2];
//                    nums[in + 2] = dummy;
//                }
//            }
//        }
//        //bubble sorting even index
//        for (int out = nums.length - 1; out >= 0; out = out - 2) {
//            for (int in = 0; in < out; in = in + 2) {
//                if (in + 2<nums.length && nums[in] > nums[in + 2]) {
//                    int dummy = nums[in];
//                    nums[in] = nums[in + 2];
//                    nums[in + 2] = dummy;
//                }
//            }
//        }
//        return nums;
//    }


//my solution
//Runtime 10ms Beats 8.04%of users with Java
//Memory 43.72MB Beats 50.00%of users with Java
//    public int[] sortEvenOdd(int[] nums) {
//        int evenSizeArray = 0;
//        int oddSizeArray = 0;
//        if (nums.length % 2 == 0) {
//            evenSizeArray = nums.length / 2 ;
//            oddSizeArray = nums.length - evenSizeArray;
//        } else {
//            evenSizeArray= nums.length / 2 + 1;
//            oddSizeArray = nums.length - evenSizeArray;
//        }
//
//        int[] even = new int[evenSizeArray];
//        int[] odd = new int[oddSizeArray];
//        int countEven = 0;
//        int countOdd = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0 || i % 2 == 0) {
//                even[countEven] = nums[i];
//                countEven++;
//            } else {
//                odd[countOdd] = nums[i];
//                countOdd++;
//            }
//        }
//
//        odd= Arrays.stream(odd).boxed()
//                .sorted(Collections.reverseOrder())
//                .mapToInt(Integer::intValue)
//                .toArray();
//
//       Arrays.sort(even);
//
//        countEven = 0;
//        countOdd = 0;
//        int[] result = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0 || i % 2 == 0) {
//                result[i] = even[countEven];
//                countEven++;
//
//            } else {
//                result[i] = odd[countOdd];
//                countOdd++;
//            }
//        }
//        return result;
//    }
}
