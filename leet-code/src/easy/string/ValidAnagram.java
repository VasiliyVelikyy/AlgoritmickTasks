package easy.string;

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

    //other solution
    //sorting approach
    //Runtime 3 ms Beats 90.15%
    //Memory 44.70 MB Beats 44.99%
//    public boolean isAnagram(String s, String t) {
//        var sArr = s.toCharArray();
//        var tArr = t.toCharArray();
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//        return Arrays.equals(sArr, tArr);
//    }

    //other solution
    //hash table approach
    //Runtime 14 ms Beats 29.64%
    //Memory 45.06 MB Beats 11.84%
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        Map<Character, Integer> map =new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            map.put(c,map.getOrDefault(c,0) + 1);
//        }
//
//        for (char c : t.toCharArray()) {
//            map.put(c,map.getOrDefault(c,0) - 1);
//
//        }
//        for (int val : map.values()) {
//            if (val != 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    //other solution
    //hash table using array
    //Runtime 3 ms Beats 90.15%
    //Memory 43.38 MB Beats 69.45%
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];  //26 letters
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int ele : count) {
            if (ele != 0) return false;
        }
        return true;
    }

    //my solution
    //Runtime 622 ms Beats 5.19%
    // Memory 46.21 MB Beats 7.34%
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        for (int i = 0; i < t.length(); i++) {
//            s = s.replaceFirst(t.charAt(i) + "", "");
//        }
//        return s.isEmpty();
//    }


    //my solution
    //Runtime 26 ms Beats 6.50%
    //Memory 44.74 MB Beats 35.92%
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        Map<Character, Long> map = s.chars()
//                .mapToObj(c -> (char) c) // Convert each char to Character
//                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
//
//
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            Long value = map.get(ch);
//
//            if (value == null) {
//                return false;
//            }
//            value--;
//            if (value == 0) {
//                map.remove(ch);
//            } else {
//                map.put(ch, value);
//            }
//        }
//        return map.isEmpty();
//    }

}
