package easy.string;

/*125. Valid Palindrome
Easy
Topics
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.*/
public class ValidPalindrome {

    //right solution
    //Runtime 2 ms Beats 99.09%
    //Memory 42.94 MB Beats 83.49%
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char first = s.charAt(start);
            char second = s.charAt(end);
            if (!Character.isLetterOrDigit(first)) {
                start++;
            } else if (!Character.isLetterOrDigit(second)) {
                end--;
            } else {
                if (Character.toLowerCase(first) != Character.toLowerCase(second)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }


    //my solution
    //Runtime 13 ms Beats 43.99%
    //Memory 44.97 MB Beats 36.32%
//    public boolean isPalindrome(String s) {
//        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//
//        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
//            if (s.charAt(i) != s.charAt(j)) {
//                return false;
//            }
//        }
//        return true;
//    }
}
