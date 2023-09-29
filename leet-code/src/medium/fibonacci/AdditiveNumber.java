package medium.fibonacci;

import java.util.ArrayList;
import java.util.List;

//306. Additive Number
/*An additive number is a string whose digits can form an additive sequence.

A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

Given a string containing only digits, return true if it is an additive number or false otherwise.

Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.



Example 1:

Input: "112358"
Output: true
Explanation:
The digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
Example 2:

Input: "199100199"
Output: true
Explanation:
The additive sequence is: 1, 99, 100, 199.
1 + 99 = 100, 99 + 100 = 199


Constraints:

1 <= num.length <= 35
num consists only of digits.


Follow up: How would you handle overflow for very large input integers?*/
public class AdditiveNumber {

    //other solution
    //Runtime 1ms Beats 89.22%of users with Java
    //Memory 40.65MB Beats 41.10%of users with Java
    public boolean isAdditiveNumber(String num) {
        List<Integer> result = new ArrayList<>();
        isAdditiveCurrNum(result, num, 0);
        return !result.isEmpty();
    }


    private boolean isAdditiveCurrNum(List<Integer> result, String numbers, int currentIndex) {
        if (currentIndex == numbers.length()) {
            return result.size() > 2;
        }
        int currentNum = 0;
        for (int i = currentIndex; i < numbers.length(); i++) {
            currentNum = currentNum * 10 + (numbers.charAt(i) - '0');

            if (result.size() < 2 || result.get(result.size() - 1) + result.get(result.size() - 2) == currentNum) {
                result.add(currentNum);
                if (isAdditiveCurrNum(result, numbers, i + 1)) return true;
                result.remove(result.size()-1);
            }
            if (i == currentIndex && numbers.charAt(i) == '0') return false;
        }
        return false;
    }
}
