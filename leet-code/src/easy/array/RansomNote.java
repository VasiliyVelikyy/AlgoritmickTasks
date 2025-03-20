package easy.array;

import java.util.HashMap;
import java.util.Map;

/*383. Ransom Note
Easy
Topics
Companies
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and
 false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.*/
public class RansomNote {

    //my solution
    //Runtime 1 ms Beats 99.06%
    //Memory 44.63 MB Beats 86.45%
//    public boolean canConstruct(String ransomNote, String magazine) {
//        int[]chars = new int[26];
//        for (char c : magazine.toCharArray()) {
//            chars[c - 'a']++;
//        }
//
//        for (char c : ransomNote.toCharArray()) {
//            chars[c - 'a']--;
//        }
//        for (int remain: chars) {
//            if (remain < 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    //my solution
    //Runtime 11 ms Beats 64.27%
    //Memory 45.29 MB Beats 41.33%
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (int c : map.values()) {
            if (c < 0) {
                return false;
            }
        }
        return true;
    }
}
