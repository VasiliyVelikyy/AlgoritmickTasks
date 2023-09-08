package test;

import domain.ListNode;
import medium.SplitLinkedListinParts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitLinkedListinPartsTest {

    @Test
    void splitListToParts() {
        SplitLinkedListinParts solution=new SplitLinkedListinParts();
        ListNode[] actual =solution.splitListToParts(initTenElement(),3);
        assertEquals(actual[0].val,1);
        assertEquals(actual[1].val,5);
        assertEquals(actual[2].val,8);


        actual =solution.splitListToParts(initThreeElement(),5);
        assertEquals(actual[0].val,1);
        assertEquals(actual[1].val,2);
    }

    private static ListNode initTenElement() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        ListNode nine = new ListNode(9);
        ListNode ten = new ListNode(10);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;
        nine.next = ten;
        ten.next = null;
        return one;
    }
    private static ListNode initThreeElement() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;
        return one;
    }
}