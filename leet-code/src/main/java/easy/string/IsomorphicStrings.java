package easy.string;

import java.util.HashMap;
import java.util.Map;

/*
* 205. Isomorphic Strings
Easy

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true
* */
public class IsomorphicStrings {
    //Other Solution
    //
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    //My solution
    //Runtime 10 ms Beats 74.26%
    //Memory 42.32 MB Beats 85.63%
//    public boolean isIsomorphic(String s, String t) {
//        if (s.length() != t.length()) return false;
//        Map<Character, Character> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            char d = t.charAt(i);
//            if (map.containsKey(c)) {
//                if (map.get(c) != d) return false;
//            } else if (map.containsValue(d)) {
//                return false;
//            } else {
//                map.put(c, d);
//            }
//        }
//        return true;
//    }
}
