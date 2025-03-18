package easy.linked_list;

import domain.ListNode;

/*83. Remove Duplicates from Sorted List
* Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
*
* Input: head = [1,1,2]
Output: [1,2]
*
* Input: head = [1,1,2,3,3]
Output: [1,2,3]
* Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*
* public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }*/
public class RemoverDuplicatesFromSortedList {

    //my solution
    //Runtime 0 ms Beats 100.00%
    //Memory 43.96 MB Beats 85.83%
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
