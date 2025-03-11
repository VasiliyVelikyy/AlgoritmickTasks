package easy.string;

import java.util.Map;
import java.util.stream.Collectors;

/*
242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:
Input: s = "anagram", t = "nagaram"

Output: true

Example 2:
Input: s = "rat", t = "car"

Output: false*/
public class ValidAnagram {

    //my solution
    //Runtime 622 ms Beats 5.19%
    // Memory 46.21 MB Beats 7.34%
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < t.length(); i++) {
            s = s.replaceFirst(t.charAt(i) + "", "");
        }

        return s.isEmpty();

    }


    //
//        Map<Character, Long> map = s.chars()
//                .mapToObj(c -> (char) c) // Convert each char to Character
//                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
//
//
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            Long value = map.get(ch);
//            if (value == 0) {
//                map.remove(ch);
//            } else if (value == null) {
//                return false;
//            } else {
//                map.put(ch, value-1);
//            }
//
//        }
//        return map.isEmpty();
}
