package easy.string;

import java.util.ArrayList;
import java.util.List;

//500. Keyboard Row
 /*
Easy
Topics
premium lock icon
Companies
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm"

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]

Output: ["Alaska","Dad"]

Explanation:

Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:

Input: words = ["omk"]

Output: []

Example 3:

Input: words = ["adsdf","sfd"]

Output: ["adsdf","sfd"]


Constraints:

1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase).

Accepted
330 545/447.6K
Acceptance Rate
73.8%.*/
public class KeyboardRow {



    //My solution
    //Runtime 1 ms Beats 34.74%
    //Memory 42.84 MB Beats 49.65%
    /*
    private static final String FIRST_ROW = "qwertyuiop";
    private static final String SECOND_ROW = "asdfghjkl";
    private static final String THIRD_ROW = "zxcvbnm";

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            checkOneRow(FIRST_ROW, word, result);
            checkOneRow(SECOND_ROW, word, result);
            checkOneRow(THIRD_ROW, word, result);
        }
        return result.toArray(String[]::new);
    }

    private void checkOneRow(String row, String word, List<String> result) {
        boolean find = false;

        String lowerCaseWord = word.toLowerCase();
        for (int i = 0; i < lowerCaseWord.length(); i++) {
            for (int j = 0; j < row.length(); j++) {
                if (lowerCaseWord.charAt(i) == row.charAt(j)) {
                    find = true;
                    break;
                }
                if (j == row.length() - 1) {
                    find = false;
                }
            }
            if (!find) {
                return;
            }
        }
        result.add(word);
    }*/

    //Other solution
    //Runtime 0 ms Beats 100.00%
    // Memory 43.06 MB Beats 16.31%
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        String first = "qwertyuiop";
        String Secound = "asdfghjkl";
        String Third = "zxcvbnm";
        for (String i : words) {
            if (isinrow(i, first) || isinrow(i, Secound) || isinrow(i, Third))
                ans.add(i);
        }
        return ans.toArray(new String[0]);
    }

    private boolean isinrow(String string, String row) {
        for (char c : string.toCharArray()) {
            if (row.indexOf(Character.toLowerCase(c)) == -1) {
                return false;
            }
        }
        return true;
    }
}
