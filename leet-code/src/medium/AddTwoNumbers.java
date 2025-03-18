package medium;

import common.domain.ListNode;

//2. Add Two Numbers
/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.*/
public class AddTwoNumbers {

    //my solution
    //Runtime 1 ms Beats 100.00%
    //Memory 44.64 MB Beats 41.55%
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curTop = l1;
        ListNode curBottom = l2;
        ListNode answer = new ListNode();
        ListNode curAnswer = answer;
        byte remainder = 0;

        while (curTop != null || curBottom != null || remainder != 0) {
            byte leftElem = curTop == null ? 0 : (byte) curTop.val;
            byte rightElem = curBottom == null ? 0 : (byte) curBottom.val;

            byte sumElem = (byte) (leftElem + rightElem + remainder);

            if (remainder > 0) { //if used remainder,reset
                remainder = 0;
            }

            if (sumElem >= 10) {
                remainder++;
                sumElem = (byte) (sumElem % 10);
                curAnswer.val = sumElem;
            } else {
                curAnswer.val = sumElem;
            }
            curTop = curTop == null ? null : curTop.next;
            curBottom = curBottom == null ? null : curBottom.next;

            if (curTop != null || curBottom != null || remainder != 0) {
                curAnswer.next = new ListNode();
            } else {
                curAnswer.next = null; //if last element set null for cursor
            }

            curAnswer = curAnswer.next;
        }
        return answer;
    }

}
