package easy;

import java.math.BigInteger;
import java.util.stream.IntStream;

//66. Plus One
/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.*/
public class PlusOne {

    //my solution
    //Runtime  4ms Beats 6.85%of users with Java
    //Memory 41.18MB Beats 20.00%of users with Java
//    public int[] plusOne(int[] digits) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < digits.length; i++) {
//            sb.append(digits[i]);
//        }
//        BigInteger temp = new BigInteger(sb.toString());
//        temp= temp.add(new BigInteger("1"));
//
//        String s = String.valueOf(temp);
//        int[] aswer = new int[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            aswer[i] = Character.getNumericValue(s.charAt(i));
//        }
//        return aswer;
//    }

    //my solution
    //Runtime  0ms Beats 100.00%of users with Java
    //Memory 40.85MB Beats 61.88%of users with Java
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] < 10) {
                break;
            } else digits[i] = 0;
            if (i == 0) {
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                System.arraycopy(digits, 0, arr, 1, digits.length);
                return arr;
            }
        }
        return digits;
    }
}

