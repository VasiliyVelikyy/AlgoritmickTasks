package easy.linked_list;

import common.domain.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
* 160. Intersection of Two Linked Lists
Easy
Topics
premium lock icon
Companies
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:
* The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Custom Judge:

The inputs to the judge are given as follows (your program is not given these inputs):

intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
listA - The first linked list.
listB - The second linked list.
skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.



Example 1:
* Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.
* Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
*
* Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.


Constraints:

The number of nodes of listA is in the m.
The number of nodes of listB is in the n.
1 <= m, n <= 3 * 104
1 <= Node.val <= 105
0 <= skipA <= m
0 <= skipB <= n
intersectVal is 0 if listA and listB do not intersect.
intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.


Follow up: Could you write a solution that runs in O(m + n) time and use only O(1) memory?*/
public class IntersectionOfTwoLinkedLists {
    //Other solution
    //Runtime
    // 10 ms Beats 9.18%
    // Memory 48.13 MB Beats 86.10%
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> m = new HashMap<>();
        while (headA != null) {
            m.put(headA, m.getOrDefault(headA, 0) + 1);
            headA = headA.next;
        }
        while (headB != null) {
            if (m.getOrDefault(headB, 0) > 0) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    //Other solution
    //Runtime
    // 1 ms Beats 99.87%
    // Memory 49.26 MB Beats 9.37%
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     //boundary check
    //     if(headA == null || headB == null) return null;
    //
    //     ListNode a = headA;
    //     ListNode b = headB;
    //
    //     //if a & b have different len, then we will stop the loop after second iteration
    //     while( a != b){
    //         //for the end of first iteration, we just reset the pointer to the head of another linkedlist
    //         a = a == null? headB : a.next;
    //         b = b == null? headA : b.next;
    //     }
    //
    //     return a;
    // }

    //My solution
    //Runtime 6 ms Beats 21.84%
    // Memory 48.42 MB Beats 76.41%
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode pointA = headA;
    //     ListNode pointB = headB;
    //     Set<ListNode> setA = new HashSet<>();
    //     while (pointA != null) {
    //         setA.add(pointA);
    //         pointA = pointA.next;
    //     }
    //     while (pointB != null) {
    //         if (setA.contains(pointB)) {
    //             return pointB;
    //         }
    //         pointB = pointB.next;
    //     }
    //     return null;
    // }

    //My solution
    //Runtime 590 ms Beats 5.16%
    // Memory 48.36 MB Beats 80.94%
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode pointA = headA;
    //     ListNode pointB = headB;
    //
    //     while (true) {
    //         if (pointA == null && pointB == null) {
    //             return null;
    //         }
    //         if (pointA == pointB) {
    //             return pointA;
    //         } else {
    //             if (pointA == null) {
    //                 pointA = headA;
    //                 pointB = pointB.next;
    //             } else {
    //                 pointA = pointA.next;
    //             }
    //         }
    //     }
    // }
}
