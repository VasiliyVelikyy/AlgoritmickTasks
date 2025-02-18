package easy.linked_list;

import domain.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode actual = solution.mergeTwoLists(initFirstNode(), initSecondNode());
        List<Integer> actualElemsList = collectNodeValues(actual);
        List<Integer> expectedElemsList = Arrays.stream(new int[]{1, 4, 5, 6}).boxed().collect(Collectors.toList());
        assertEquals(expectedElemsList, actualElemsList);

        actual = solution.mergeTwoLists(initFirstNodeTwo(), initSecondNodeTwo());
        actualElemsList = collectNodeValues(actual);
        expectedElemsList = Arrays.stream(new int[]{1, 1, 2, 3, 4, 4}).boxed().collect(Collectors.toList());
        assertEquals(expectedElemsList, actualElemsList);

        actual = solution.mergeTwoLists(null, new ListNode(0));
        actualElemsList = collectNodeValues(actual);
        expectedElemsList = Arrays.stream(new int[]{0}).boxed().collect(Collectors.toList());
        assertEquals(expectedElemsList, actualElemsList);

        actual = solution.mergeTwoLists(null, null);
        assertNull(actual);

        actual = solution.mergeTwoLists(new ListNode(2), new ListNode(1));
        actualElemsList = collectNodeValues(actual);
        expectedElemsList = Arrays.stream(new int[]{1,2}).boxed().collect(Collectors.toList());
        assertEquals(expectedElemsList, actualElemsList);


        actual = solution.mergeTwoLists(new ListNode(5), initFirstNodeTwo());
        actualElemsList = collectNodeValues(actual);
        expectedElemsList = Arrays.stream(new int[]{1,2,4,5}).boxed().collect(Collectors.toList());
        assertEquals(expectedElemsList, actualElemsList);

        actual = solution.mergeTwoLists(initFirstNodeThree(), initSecondNodeThree());
        actualElemsList = collectNodeValues(actual);
        expectedElemsList = Arrays.stream(new int[]{-9,3,5,7}).boxed().collect(Collectors.toList());
        assertEquals(expectedElemsList, actualElemsList);

    }

    private static ListNode initFirstNode() {
        ListNode one = new ListNode(1);
        one.next = new ListNode(6);
        return one;
    }

    private static ListNode initSecondNode() {
        ListNode four = new ListNode(4);
        four.next = new ListNode(5);
        return four;
    }

    private static ListNode initFirstNodeTwo() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode four = new ListNode(4);
        one.next = two;
        two.next = four;
        return one;
    }

    private static ListNode initSecondNodeTwo() {
        ListNode one = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.next = three;
        three.next = four;
        return one;
    }

    private static ListNode initFirstNodeThree() {
        ListNode one = new ListNode(-9);
        one.next = new ListNode(3);
        return one;
    }

    private static ListNode initSecondNodeThree() {
        ListNode one = new ListNode(5);
        one.next = new ListNode(7);
        return one;
    }

    private List<Integer> collectNodeValues(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values;
    }
}