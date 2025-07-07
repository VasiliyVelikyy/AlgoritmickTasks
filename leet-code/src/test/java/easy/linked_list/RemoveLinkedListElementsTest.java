package easy.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.ListNodeCollectors.arrayFromListNode;
import static utils.ListNodeCollectors.listNodeFromArray;

class RemoveLinkedListElementsTest {
    RemoveLinkedListElements solution = new RemoveLinkedListElements();

    @Test
    void removeElements() {
        var enterListNode = listNodeFromArray(new int[]{1, 2, 6, 3, 4, 5, 6});
        var removedListNode = solution.removeElements(enterListNode, 6);
        var actualArray = arrayFromListNode(removedListNode);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actualArray);
    }

    @Test
    void removeElements2() {
        var enterListNode = listNodeFromArray(new int[]{7,7,7,7});
        var removedListNode = solution.removeElements(enterListNode, 7);
        var actualArray = arrayFromListNode(removedListNode);
        assertArrayEquals(new int[]{}, actualArray);
    }





}