package easy;

import java.util.Arrays;

public class RemoveElement {
//    public int removeElement(int[] nums, int val) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//            if (nums[i] == val) nums[i] = -1;
//            else count++;
//        }
//
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
// почему сделал так? - хотел отсортировать значения массива как указано было в примере
//            for (int i = 0; i < nums.length - 1; i++) {
//
//                if (nums[i] < nums[i + 1]) {
//                    isSorted = false;
//                    int temp = nums[i];
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = temp;
//                }
//            }
//        }
//        return count;
//    }

    //2 способ
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}


