package easy.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TreeNodeUtilsTest {

    @Test
    void fromIntArray() {
        var expectedIntsArray = new Integer[]{4, 2, 7, 1, 3, 6, 9};
        var actualTreeNode = TreeNodeUtils.fromIntArray(expectedIntsArray);
        var actualIntsArray = TreeNodeUtils.fromTreeNode(actualTreeNode);
        assertArrayEquals(expectedIntsArray, actualIntsArray);
    }

}