package easy.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static utils.ListNodeCollectors.arrayFromListNode;
import static utils.ListNodeCollectors.listNodeFromArray;

class MiddleOfTheLinkedListTest {

    MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    @Test
    void middleNode() {
        var node = listNodeFromArray(new int[]{1, 2, 3, 4, 5});
        var answerNode = solution.middleNode(node);
        int[] actual = arrayFromListNode(answerNode);
        assertArrayEquals(new int[]{3, 4, 5}, actual);
    }

    @Test
    void middleNode2() {
        var node = listNodeFromArray(new int[]{1, 2, 3, 4, 5, 6});
        var answerNode = solution.middleNode(node);
        int[] actual = arrayFromListNode(answerNode);
        assertArrayEquals(new int[]{4, 5, 6}, actual);
    }
}