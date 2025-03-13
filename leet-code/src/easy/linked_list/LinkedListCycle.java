package easy.linked_list;

import domain.ListNode;

import java.util.HashMap;
import java.util.Map;

/*

141. Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
 connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.



Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.


Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.


Follow up: Can you solve it using O(1) (i.e. constant) memory?*/
public class LinkedListCycle {

    //other solution
    //Runtime 0 ms Beats 100.00%
    //Memory 44.27 MB Beats 88.37%
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }


    //my solution
    //Runtime 6 ms Beats 9.18%
    //Memory 44.84 MB Beats 18.90%
//    public boolean hasCycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return false;
//        } else {
//            Map<ListNode, ListNode> map = new HashMap<>();
//            ListNode cur = head;
//            while (cur != null) {
//
//                var elem = map.get(cur);
//                if (elem == null) {
//                    if (cur.next == null) {
//                        cur = null;
//                    } else {
//                        map.put(cur, cur.next);
//                        cur = cur.next;
//                    }
//                } else return true;
//            }
//            return false;
//        }
//    }
}
