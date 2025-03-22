package easy.string;

//58. Length of Last Word
/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.


Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.*/
public class LengthOfLastWord {

    //my solution
    //Runtime Details 1ms Beats 43.41%of users with Java
    //Memory  40.44MB Beats 87.23%of users with Java
//    public int lengthOfLastWord(String s) {
//      String[]arrayStr=  s.split(" ");
//      return arrayStr[arrayStr.length-1].length();
//    }


    //my solution
    //Runtime Details 2ms Beats 13.09%of users with Java
    //Memory  40.52MB Beats 77.30%of users with Java
//    public int lengthOfLastWord(String s) {
//        s = s.trim();
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != ' ') count++;
//            else count = 0;
//        }
//        return count;
//    }


    //other solution
    //Runtime Details 0ms Beats 100.00%of users with Java
    //Memory  40.27MB Beats 97.63%of users with Java
    public int lengthOfLastWord(String s) {
        int i=0,n=s.length(),j=n-1;
        while(i<n){
            if(s.charAt(i)==' ') i++;
            else break;
        }
        while(j>=0){
            if(s.charAt(j)==' ') j--;
            else break;
        }
        String[] parts=s.substring(i,j+1).split(" ");
        return parts[parts.length-1].length();
    }
}
