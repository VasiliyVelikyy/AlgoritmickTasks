package medium;

import domain.ListNode;
import medium.ReverseLinkedListTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTwoTest {

    @Test
    void reverseBetween() {
        ReverseLinkedListTwo solution= new ReverseLinkedListTwo();
        ListNode actual= solution.reverseBetween(initTenElement(),4,7);
        List<Integer> result=solution.getResultVsl(actual);

        List<Integer>expected= Arrays.asList(1, 2, 3, 7, 6, 5, 4);
        Assertions.assertEquals(result,expected);

    }

    private static ListNode initTenElement() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);


        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        return one;
    }
}