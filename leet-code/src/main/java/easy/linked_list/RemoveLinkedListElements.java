package easy.linked_list;

import common.domain.ListNode;

/*
* 203. Remove Linked List Elements
Easy
Topics
premium lock icon
Companies
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
*
* Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []


Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
* */
public class RemoveLinkedListElements {

    //My solution
    //Runtime 1 ms Beats 93.35%
    //Memory 45.70 MB Beats 39.50%
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        if (head.next == null && head.val == val) return null;

        ListNode last = new ListNode(-1);
        last.next = head;
        head = last;

        ListNode cur = head.next;

        while (cur != null) {
            if (cur.val == val) {
                last.next = cur.next;
                cur = cur.next;
            } else {
                last = cur;
                cur = cur.next;
            }
        }
        head = head.next;
        return head;
    }
}
