package easy.string;

import java.util.HashMap;
import java.util.Stack;

//20. Valid Parentheses
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"  ({[]})
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.*/
public class ValidParentheses {

    //my Solution
    //Runtime 3 ms Beats 42.11%
    //Memory 41.59 MB Beats 91.42%
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                var lastElem = stack.pop();
                if (map.get(lastElem) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    //my Solution
    //Runtime 2ms Beats 84.12%of users with Java
    //Memory 40.38MB Beats 77.10%of users with Java
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
//                stack.add(currentChar);
//            } else {
//                if (!stack.isEmpty()) {
//                    char lastChar = stack.peek();
//                    if (!((lastChar == '(' && currentChar == ')') ||
//                            (lastChar == '[' && currentChar == ']') ||
//                            (lastChar == '{' && currentChar == '}'))) {
//                        return false;
//                    }
//                    stack.pop();
//                } else return false;
//            }
//        }
//        return stack.empty();
//    }
}

