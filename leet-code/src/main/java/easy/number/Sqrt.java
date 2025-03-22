package easy.number;

//69. Sqrt(x)
/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1*/
public class Sqrt {
    //my Solution
    //Runtime 20ms Beats 13.00%of users with Java
    //Memory 39.62MB Beats 43.00%of users with Java
//    public int mySqrt(int x) {
//        long answer = 1;
//        for (int i = 2; i < Integer.MAX_VALUE; i++) {
//            if ((answer * answer) > x) {
//                answer = answer - 1;
//                break;
//            } else answer = i;
//        }
//        return (int) answer;
//    }

    //otherSolution
    //Runtime 1ms Beats 97.50%of users with Java
    //Memory 39.42MB Beats 70.65%of users with Java
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int start = 1;
        int end = x;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        }
        return Math.round(end);
    }
}
