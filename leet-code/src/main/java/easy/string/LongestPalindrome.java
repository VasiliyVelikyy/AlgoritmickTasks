package easy.string;

/*409. Longest Palindrome
Easy
Topics
Companies
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.



Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.


Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.*/
public class LongestPalindrome {

    //other solution
    //Runtime 1 ms Beats 99.94%
    //Memory 41.76 MB Beats 81.75%
    public int longestPalindrome(String s) {
        int oddCount = 0;
        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
            if (freq[ch] % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }

        if (oddCount > 1)
            return s.length() - oddCount + 1;
        return s.length();
    }

    //my solution
    //Runtime 7 ms Beats 52.44%
    //Memory 42.02 MB Beats 45.26%
//    public int longestPalindrome(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        int res = 0;
//        boolean existMiddleElem = false;
//        for (int value : map.values()) {
//            if (value % 2 == 1 && !existMiddleElem) {
//                existMiddleElem = true;
//                res += value;
//            } else if (value % 2 == 0) {
//                res += value;
//            } else {
//                res = res + (value - 1);
//            }
//        }
//        return res;
//    }

    //other solution
    //Runtime 5 ms Beats 73.62%
    //Memory 42.43 MB Beats 11.97%
//    public int longestPalindrome(String s) {
//        Set<Character> set = new HashSet<>();
//        int count = 0;
//        for (char c : s.toCharArray()) {
//            if (set.contains(c)) {
//                set.remove(c);
//                count++;
//            } else {
//                set.add(c);
//            }
//        }
//        if (!set.isEmpty()) {
//            return count * 2 + 1;
//
//        }
//        return count * 2;
//    }
}
