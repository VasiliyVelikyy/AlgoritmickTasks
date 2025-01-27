package medium;

import domain.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utility.CollectorListNodeToString.getStringValFromListNode;

class AddTwoNumbersTest {

    AddTwoNumbers solution = new AddTwoNumbers();

    @Test
    void addTwoNumbers() {
        var nodes = solution.addTwoNumbers(initFirstNode(), initSecondNode());
        String actual = getStringValFromListNode(nodes);
        assertEquals("[7,0,8]", actual);

    }

    @Test
    void addTwoNumbers2() {
        var nodes = solution.addTwoNumbers(initFirstNode2(), initSecondNode2());
        String actual = getStringValFromListNode(nodes);
        assertEquals("[8,9,9,9,0,0,0,1]", actual);

    }

    @Test
    void addTwoNumbers3() {
        var nodes = solution.addTwoNumbers(initFirstNode3(), initSecondNode3());
        String actual = getStringValFromListNode(nodes);
        assertEquals("[6,7,7,1]", actual);

    }

    private ListNode initSecondNode3() {
        return new ListNode(5, new ListNode(7, new ListNode(8)));
    }

    private ListNode initFirstNode3() {
        return new ListNode(1, new ListNode(0, new ListNode(9)));
    }

    private ListNode initSecondNode2() {
        return new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
    }

    private ListNode initFirstNode2() {
        return new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));
    }

    private ListNode initSecondNode() {
        return new ListNode(2, new ListNode(4, new ListNode(3)));
    }

    private ListNode initFirstNode() {
        return new ListNode(5, new ListNode(6, new ListNode(4)));
    }


}