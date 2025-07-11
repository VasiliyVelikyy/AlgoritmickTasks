package easy.chars;

import utils.Reader4;

/*157 Read N Characters Given Read4
Premium
Easy

Given a file and assume that you can only read the file using a given method: read4, implement a method to read n characters.

Method read4:
The API read4 reads four consecutive characters from the file, then writes those characters into the buffer array buf4. The return value is the number of actual characters read.

Note that read4() has its own file pointer, much like FILE *fp in C.

Definition of read4:
Parameter: char[] buf4
Returns: int
buf4[] is a destination, not a source. The results from read4 will be copied to buf4[].

Below is a high-level example of how read4 works:

The first call of read4:
We read 4 characters from the file: a b c d e.
Result: buf4 = "abcd".
read4 returns 4.
The second call of read4:
We read the remaining character from the file: e.
Result: buf4 = "e".
read4 returns 1.

Method read:

By using the read4 method, implement the method read that reads n characters from file and store it in the buffer array buf. Consider that you cannot manipulate file directly.

The return value is the number of actual characters read.

Definition of read:
Parameters: char[] buf, int n
Returns: int
buf[] is a destination, not a source. You will need to write the results to buf[].

Note:
Consider that you cannot manipulate the file directly. The file is only accessible for read4 but not for read.
The read function will only be called once for each test case.
You may assume the destination buffer array, buf, is guaranteed to have enough space for storing n characters.

use apis int reader4(char [] buf4);


Example 1:
Input: file = "abc", n = 4
Output: 3
Explanation: After calling your read method, buf should contain "abc". We read a total of 3 characters
 from the file, so return 3.
Note that "abc" is the file's content, not buf. buf is the destination buffer that you will have to write
 the results to.
Example 2:


Input: file = "abcde", n = 5
Output: 5
Explanation: After calling your read method, buf should contain "abcde". We read a total of 5 characters
from the file, so return 5.
Example 3:

Input: file = "abcdABCD1234", n = 12
Output: 12
Explanation: After calling your read method, buf should contain "abcdABCD1234". We read a total of 12
characters from the file, so return 12.
Example 4:


Input: file = "leetcode", n = 5
Output: 5
Explanation: After calling your read method, buf should contain "leetc". We read a total of 5 characters
from the
*/
public class ReadNCharacterGivenReadFour extends Reader4 {

    //Other solution
    public int read(char[] buf, int n) {
        boolean eof = false;
        char[] temp = new char[4];
        int total = 0;
        while (!eof && total < n) {
            int count = reader4(buf);
            eof = count < 4;
            count = Math.min(count, n - total);
            for (int i = 0; i < count; i++) {
                buf[total++] = temp[i];
            }
        }
        return total;
    }
}
