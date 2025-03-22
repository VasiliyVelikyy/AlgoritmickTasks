package medium.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 1190. Reverse Substrings Between Each Pair of Parentheses
 */

/*You are given a string s that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should not contain any brackets.



Example 1:

Input: s = "(abcd)"
Output: "dcba"
Example 2:

Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.
Example 3:

Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.


Constraints:

1 <= s.length <= 2000
s only contains lower case English characters and parentheses.
It is guaranteed that all parentheses are balanced.*/
public class ReverseSubstringsBetweenEachPairOfParentheses {
    private final char COMMA_LEFT = '(';
    private final char COMMA_RIGHT = ')';

    //my solution
    //Runtime 5ms Beats 50.68%
    // Memory 41.56 MB Beats 69.01%
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> listForReverse = new ArrayList<>();
        Boolean fetch = true;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == COMMA_RIGHT) {
                fetchLastChar(fetch, listForReverse, stack);
                returnCharForStack(stack, listForReverse);
            } else {
                stack.push(currentChar);
            }
        }
        StringBuilder result = new StringBuilder();
        stack.forEach(elem -> {
            if (elem != COMMA_LEFT && elem != COMMA_RIGHT) {
                result.append(elem);
            }
        });

        return result.toString();
    }

    private void returnCharForStack(Stack<Character> stack, List<Character> listForReverse) {
        listForReverse.forEach(stack::push);
        listForReverse.clear();
    }

    private void fetchLastChar(Boolean fetch, List<Character> listForReverse, Stack<Character> stack) {
        while (fetch) {
            char fetchChar = stack.pop();
            if (fetchChar != COMMA_LEFT) {
                listForReverse.add(fetchChar);
            } else {
                fetch = false;
            }
        }
    }
}
