package medium.string;

//880. Decoded String at Index
/*You are given an encoded string s. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:

If the character read is a letter, that letter is written onto the tape.
If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.
Given an integer k, return the kth letter (1-indexed) in the decoded string.



Example 1:

Input: s = "leet2code3", k = 10
Output: "o"
Explanation: The decoded string is "leetleetcodeleetleetcodeleetleetcode".
The 10th letter in the string is "o".
Example 2:

Input: s = "ha22", k = 5
Output: "h"
Explanation: The decoded string is "hahahaha".
The 5th letter is "h".
Example 3:

Input: s = "a2345678999999999999999", k = 1
Output: "a"
Explanation: The decoded string is "a" repeated 8301530446056247680 times.
The 1st letter is "a".


Constraints:

2 <= s.length <= 100
s consists of lowercase English letters and digits 2 through 9.
s starts with a letter.
1 <= k <= 109
It is guaranteed that k is less than or equal to the length of the decoded string.
The decoded string is guaranteed to have less than 263 letters.*/
public class DecodedStringAtIndex {
    //other solution
    //Runtime 0ms Beats 100.00%of users with Java
    //Memory 40.47MB Beats 43.81%of users with Java
    public String decodeAtIndex(String inputString, int k) {
        long decodedLength = 0; // Total length of the decoded string

        for (char character : inputString.toCharArray()) {
            if (Character.isDigit(character)) {
                // If the character is a digit, update the decoded length accordingly
                decodedLength *= (character - '0');
            } else {
                // If the character is a letter, increment the decoded length
                decodedLength++;
            }
        }

        // Traverse the input string in reverse to decode and find the kth character
        for (int i = inputString.length() - 1; i >= 0; i--) {
            char currentChar = inputString.charAt(i);

            if (Character.isDigit(currentChar)) {
                // If the character is a digit, adjust the length and k accordingly
                decodedLength /= (currentChar - '0');
                k %= decodedLength;
            } else {
                // If the character is a letter, check if it's the kth character
                if (k == 0 || decodedLength == k) {
                    return String.valueOf(currentChar); // Return the kth character as a string
                }
                decodedLength--;
            }
        }
        return ""; // Return an empty string if no character is found

    }
}
