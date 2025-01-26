package easy;

import domain.ListNode;
import org.junit.jupiter.api.Test;

class RemoverDuplicatesFromSortedListTest {
    RemoverDuplicatesFromSortedList solution = new RemoverDuplicatesFromSortedList();

    @Test
    void deleteDuplicates1() {
        solution.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
    }

    @Test
    void deleteDuplicates2() {
        solution.deleteDuplicates(
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(3))))));
    }
}