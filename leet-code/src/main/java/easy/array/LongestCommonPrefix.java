package easy.array;

import java.util.Arrays;

//14. Longest Common Prefix
/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/
public class LongestCommonPrefix {

    //my solution
    //Runtime 3ms Beats 24.40%of users with Java
    //Memory 42.81MB Beats 6.14%of users with Java
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 1) return strs[0];
//        else if (strs.length == 0) return "";
//        else {
//            int countSubstr = 0;
//            String currentStr = strs[0];
//
//            for (int j = 1; j <= currentStr.length(); j++) {
//                String subTarget = currentStr.substring(0, j);
//                for (int i = 1; i < strs.length; i++) {
//                    String destStr = strs[i];
//                    if (destStr.length() >= j) {
//                        String subDest = destStr.substring(0, j);
//                        if (!subTarget.equals(subDest)) {
//                            if (countSubstr == 0) return "";
//                            else return currentStr.substring(0, countSubstr);
//                        }
//                    }
//                    else return currentStr.substring(0, countSubstr);
//                }
//
//                countSubstr++;
//            }
//            return currentStr;
//        }
//    }

    //other solution
    //Runtime 1ms Beats 82.84%of users with
    //Memory 40.14MB Beats 80.18%of users with
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answ = new StringBuilder();
        Arrays.sort(strs);

        String firstStr = strs[0];
        String lastString = strs[strs.length - 1];

        for (int j = 0; j < firstStr.length(); j++) {
            if (firstStr.charAt(j) != lastString.charAt(j)) return answ.toString();
            else answ.append(firstStr.charAt(j));
        }
        return answ.toString();
    }
}

