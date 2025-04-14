package easy.linked_list;

import common.domain.ListNode;

/*
*876. Middle of the Linked List
* Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.



Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100*/
public class MiddleOfTheLinkedList {

    //my solution
    //Runtime 0 ms Beats 100.00%
    //Memory 41.76 MB Beats 7.04%
//    public ListNode middleNode(ListNode head) {
//        Map<Integer, ListNode> map = new HashMap<>();
//        int index = 0;
//        while (head != null) {
//            map.put(index++, head);
//            head = head.next;
//        }
//        return map.get(index / 2);
//    }

    //other solution Rabbit and tortoise
    //Runtime 0 ms Beats 100.00%
    //Memory 40.94 MB Beats 86.75%
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
