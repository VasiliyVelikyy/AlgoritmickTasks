package medium;

import java.util.*;

//316. Remove Duplicate Letters
/*Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is
the smallest in lexicographical order
 among all possible results.

Lexicographically Smaller
A string a is lexicographically smaller than a string b if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
If the first min(a.length, b.length) characters do not differ, then the shorter string is the lexicographically smaller one.

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"


Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.


Note: This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/*/
public class RemoveDuplicateLetters {


    //other solution
    //Runtime 3ms Beats 59.82%of users with Java
    //Memory 41.33MB Beats 49.67%of users with Java
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();
        Map<Character, Integer> lastIndexes = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndexes.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!seen.contains(currentChar)) {
                while (!stack.isEmpty() && currentChar < stack.peek() && i < lastIndexes.get(stack.peek())) {
                    seen.remove(stack.pop());
                }
                seen.add(currentChar);
                stack.push(currentChar);
            }
        }
        StringBuilder answer = new StringBuilder();
        for (char c : stack){
            answer.append(c);
        }
        return answer.toString();
    }
}
