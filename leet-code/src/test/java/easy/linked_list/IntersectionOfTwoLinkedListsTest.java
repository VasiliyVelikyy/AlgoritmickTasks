package easy.linked_list;

import common.domain.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionOfTwoLinkedListsTest {
    IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();

    @Test
    void getIntersectionNode() {
        ListNode headA = new ListNode(3);
        ListNode headB = new ListNode(2);
        headB.next = headA;
        var actual = solution.getIntersectionNode(headA, headB);
        assertEquals(3, actual.val);
    }
}