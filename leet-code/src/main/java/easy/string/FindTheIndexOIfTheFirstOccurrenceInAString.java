package easy.string;

/*
* 28. Find the Index of the First Occurrence in a String
Easy
Topics
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.


Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.*/
public class FindTheIndexOIfTheFirstOccurrenceInAString {

    //Other solution
    //Runtime 1 ms Beats 22.28%
    //Memory 41.70 MB Beats 34.46%
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
        }
    }


    //My solution
    //Runtime 1 ms Beats 22.29%
    //Memory 41.30 MB Beats 95.54%
//    public int strStr(String haystack, String needle) {
//        if (needle.length() > haystack.length() || haystack.isEmpty()) return -1;
//
//        boolean found;
//        for (int i = 0; i < haystack.length(); i++) {
//            found = true;
//            for (int j = 0; j < needle.length(); j++) {
//                if (i + j < haystack.length()) {
//                    if (haystack.charAt(i + j) != needle.charAt(j)) {
//                        found = false;
//                        break;
//                    }
//                } else {
//                    found = false;
//                    break;
//                }
//            }
//
//            if (found) return i;
//        }
//        return -1;
//    }


    //my solution
    //Runtime 0 ms Beats 100.00%
    // Memory 41.46 MB Beats 78.67%
//    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }
}
