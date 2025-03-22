package easy.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TreeNodeCollectorsTest {

    @Test
    void fromIntArray() {
        var expectedIntsArray = new Integer[]{4, 2, 7, 1, 3, 6, 9};
        var actualTreeNode = TreeNodeCollectors.fromIntArray(expectedIntsArray);
        var actualIntsArray = TreeNodeCollectors.fromTreeNode(actualTreeNode);
        assertArrayEquals(expectedIntsArray, actualIntsArray);
    }

}