package easy.linked_list;

import common.domain.ListNode;

//21. Merge Two Sorted Lists
/*You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.*/

public class MergeTwoSortedLists {

    //My second solution
    //Runtime 0 ms Beats 100.00%
    //Memory 42.42 MB Beats 73.84%
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cursor1 = list1;
        ListNode cursor2 = list2;
        ListNode answer = new ListNode(0);
        ListNode cursor3 = answer;
        while (cursor1 != null && cursor2 != null) {

            if (cursor1.val >= cursor2.val) {
                cursor3.next = cursor2;
                cursor3 = cursor3.next;
                cursor2 = cursor2.next;
            } else {
                cursor3.next = cursor1;
                cursor3 = cursor3.next;
                cursor1 = cursor1.next;
            }
        }
        if (cursor1 != null) {
            cursor3.next = cursor1;
        }
        if (cursor2 != null) {
            cursor3.next = cursor2;
        }

        return answer.next;
    }


    //my Solution
    //Runtime 0ms Beats 100.00%of users with Java
    //Memory 41.33MB Beats 50.76%of users with Java
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null && list2 == null) return null;
//        if (list1 == null) return list2;
//        if (list2 == null) return list1;
//        ListNode answer;
//        ListNode secondHead;
//        if (list1.val <= list2.val) {
//            answer = list1;
//            secondHead = list2;
//        } else {
//            answer = list2;
//            secondHead = list1;
//        }
//
//        ListNode head = answer;
//        ListNode previous = head;
//        ListNode breakNode;
//
//
//        ListNode currentFormSecondHead = secondHead;
//        while (currentFormSecondHead != null) {
//            if (head == null) {
//                previous.next = currentFormSecondHead;
//                previous = currentFormSecondHead;
//                currentFormSecondHead = currentFormSecondHead.next;
//
//            } else if (head.val < currentFormSecondHead.val) {
//                previous = head;
//                head = head.next;
//            } else if (head.val > currentFormSecondHead.val) {
//                previous.next = currentFormSecondHead;
//                breakNode = currentFormSecondHead.next;
//                currentFormSecondHead.next = head;
//                previous = currentFormSecondHead;
//                currentFormSecondHead = breakNode;
//
//            } else if (head.val == currentFormSecondHead.val) { //when node values are equals
//                previous = head;
//                head = head.next;
//                previous.next = currentFormSecondHead;
//                breakNode = currentFormSecondHead.next;
//                currentFormSecondHead.next = head;
//                previous = currentFormSecondHead;
//                currentFormSecondHead = breakNode;
//            }
//        }
//        return answer;
//    }

    //Runtime 0ms Beats 100.00%of users with Java
    //Memory 41.16MB Beats 75.78%of users with Java
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode res = new ListNode();
//        ListNode current = res;
//        while(list1 != null && list2 != null) {
//            if(list1.val < list2.val) {
//                current.next = list1;
//                current= current.next;
//                list1 = list1.next;
//            } else {
//                current.next = list2;
//                current = current.next;
//                list2 = list2.next;
//            }
//        }
//        while(list1 != null) {
//            current.next = list1;
//            current = current.next;
//            list1 = list1.next;
//        }
//        while(list2 != null) {
//            current.next = list2;
//            current = current.next;
//            list2 = list2.next;
//        }
//        return res.next;
//    }
}
