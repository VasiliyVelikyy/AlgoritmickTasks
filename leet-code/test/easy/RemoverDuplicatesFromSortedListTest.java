package easy;

import domain.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


    private String getStringValFromListNode(ListNode answer) {
        StringBuilder stringBuilder = new StringBuilder("[");
        while (answer != null) {
            stringBuilder.append(answer.val).append(",");
            answer = answer.next;
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}