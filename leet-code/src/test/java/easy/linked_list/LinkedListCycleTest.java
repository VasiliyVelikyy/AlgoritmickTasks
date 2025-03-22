package easy.linked_list;

import common.domain.ListNode;
import org.junit.jupiter.api.Test;

import static easy.utils.ListNodeCollectors.fromArrayWithCycleByPosition;
import static easy.utils.ListNodeCollectors.listNodeFromArray;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListCycleTest {

    LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    void hasCycle() {
        ListNode cycleListNode = fromArrayWithCycleByPosition(new int[]{3, 2, 0, -4}, 1);
        var answer = linkedListCycle.hasCycle(cycleListNode);
        assertTrue(answer);
    }


    @Test
    void hasCycle2() {
        ListNode cycleListNode = fromArrayWithCycleByPosition(new int[]{1, 2}, 0);
        var answer = linkedListCycle.hasCycle(cycleListNode);
        assertTrue(answer);
    }

    @Test
    void hasCycle3() {
        ListNode cycleListNode = listNodeFromArray(new int[]{1});
        var answer = linkedListCycle.hasCycle(cycleListNode);
        assertFalse(answer);
    }

    @Test
    void hasCycle4() {
        ListNode cycleListNode = listNodeFromArray(new int[]{1, 2});
        var answer = linkedListCycle.hasCycle(cycleListNode);
        assertFalse(answer);
    }

    @Test
    void hasCycle5() {
        ListNode cycleListNode = listNodeFromArray(new int[]{-21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5});
        var answer = linkedListCycle.hasCycle(cycleListNode);
        assertFalse(answer);
    }

//    @Test
//    void hasCycle6() {
//        ListNode cycleListNode = listNodeFromArray(new int[]{3, 2, 0, -4, 5, 6});
//        var answer = linkedListCycle.hasCycle(cycleListNode);
//        assertTrue(answer);
//    }
//
//    @Test
//    void hasCycle7() {
//        ListNode cycleListNode = listNodeFromArray(new int[]{3, 2, 0, -4, 5});
//        var answer = linkedListCycle.hasCycle(cycleListNode);
//        assertTrue(answer);
//    }
}