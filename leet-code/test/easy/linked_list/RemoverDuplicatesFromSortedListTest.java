package easy.linked_list;

import domain.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utility.CollectorListNodeToString.getStringValFromListNode;

class RemoverDuplicatesFromSortedListTest {
    RemoverDuplicatesFromSortedList solution = new RemoverDuplicatesFromSortedList();

    @Test
    void deleteDuplicates1() {
        var answer = solution.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
        String actual = getStringValFromListNode(answer);
        assertEquals("[1,2]", actual);

    }


    @Test
    void deleteDuplicates2() {
        var answer = solution.deleteDuplicates(
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(3))))));
        String actual = getStringValFromListNode(answer);
        assertEquals("[1,2,3]", actual);
    }

}