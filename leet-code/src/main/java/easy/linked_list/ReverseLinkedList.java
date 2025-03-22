package easy.linked_list;

import common.domain.ListNode;

/*206. Reverse Linked List
Easy
Topics
Companies
Given the head of a singly linked list, reverse the list, and return the reversed list.


Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000


Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

public class ReverseLinkedList {

    //My solution iteratively
    //Runtime 0 ms Beats 100.00%
    //Memory 42.12 MB Beats 96.49%
//    public ListNode reverseList(ListNode head) {
//        if(head == null ) return head;
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode temp = curr.next;
//            curr.next = prev;
//            prev=curr;
//            curr=temp;
//
//        }
//        return prev;
//    }
//

    //Other solution recursive
    //Runtime 0 ms Beats 100.00%
    //Memory 42.31 MB Beats 81.75%
    public ListNode reverseList(ListNode head) {
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }


    //My solution
    //Runtime 1 ms Beats 5.03%
    //Memory 42.38 MB Beats 81.75%
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        Stack<ListNode> stack = new Stack<>();
//
//        while (head != null) {
//            stack.add(head);
//            head = head.next;
//        }
//
//        head = stack.pop();
//        ListNode cursor = head;
//
//        while (!stack.isEmpty()) {
//            cursor.next = stack.pop();
//            cursor = cursor.next;
//        }
//
//        cursor.next = null;
//        return head;
//    }
}
