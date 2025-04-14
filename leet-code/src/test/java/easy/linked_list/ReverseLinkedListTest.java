package easy.linked_list;

import org.junit.jupiter.api.Test;

import static utils.ListNodeCollectors.arrayFromListNode;
import static utils.ListNodeCollectors.listNodeFromArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseLinkedListTest {

    ReverseLinkedList solution = new ReverseLinkedList();

    @Test
    void reverseList() {
        var expectedArr = new int[]{5, 4, 3, 2, 1};
        var actualNode = solution.reverseList(listNodeFromArray(new int[]{1, 2, 3, 4, 5}));
        var actualArr = arrayFromListNode(actualNode);
        assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    void reverseList2() {
        var expectedArr = new int[]{2,1};
        var actualNode = solution.reverseList(listNodeFromArray(new int[]{1,2}));
        var actualArr = arrayFromListNode(actualNode);
        assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    void reverseList3() {
        var expectedArr = new int[]{};
        var actualNode = solution.reverseList(listNodeFromArray(new int[]{}));
        var actualArr = arrayFromListNode(actualNode);
        assertArrayEquals(expectedArr, actualArr);
    }
}