package easy.string;

/*
1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
Easy
Topics
Companies
Hint
Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

A prefix of a string s is any leading contiguous substring of s.



Example 1:

Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
Example 2:

Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
Example 3:

Input: sentence = "i am tired", searchWord = "you"
Output: -1
Explanation: "you" is not a prefix of any word in the sentence.


Constraints:

1 <= sentence.length <= 100
1 <= searchWord.length <= 10
sentence consists of lowercase English letters and spaces.
searchWord consists of lowercase English letters.*/
public class WordPrefixChecker {
    /*
      Runtime 1 ms Beats 9.52%
      Memory 41.48 MB Beats 27.01%
     */
//    public int isPrefixOfWord(String sentence, String searchWord) {
//        List<Integer> integers = new ArrayList<>();
//        List<String> strings = Arrays.asList(sentence.split(" "));
//        strings.forEach(str -> {
//            int prIndx = str.indexOf(searchWord);
//            if (prIndx == 0) {
//                integers.add(strings.indexOf(str) + 1); //index of list starts 0 but words start 1
//            }
//        });
//        if (integers.isEmpty()) {
//            return -1;
//        } else {
//            return integers.get(0);
//        }
//    }
//

    /**
     * Runtime 0 ms Beats 100.00%
     * Memory 41.04 MB Beats 86.28%
     */
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].indexOf(searchWord) == 0) {
                return i + 1;
            }
        }
        return -1;
    }

    //not mine

    /**
     * Runtime 0 ms Beats 100.00%
     * Memory 41.00 MB Beats 96.01%
     */
    public int isPrefixOfWord2(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }

}
