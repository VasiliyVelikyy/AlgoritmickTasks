package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utils.TreeNodeCollectors.fromIntArrayWithNullValue;

class PathSumTest {
    PathSum solution = new PathSum();

    @Test
    void hasPathSum() {
        var treeNodes = fromIntArrayWithNullValue(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
        var actual = solution.hasPathSum(treeNodes, 22);
        assertTrue(actual);
    }

    @Test
    void hasPathSum2() {
        var treeNodes = fromIntArrayWithNullValue(new Integer[]{1, 2, 3});
        var actual = solution.hasPathSum(treeNodes, 5);
        assertFalse(actual);
    }

    @Test
    void hasPathSum3() {
        var treeNodes = fromIntArrayWithNullValue(new Integer[]{10, 2, 11, 0});
        var actual = solution.hasPathSum(treeNodes, 12);
        assertTrue(actual);
    }

    @Test
    void hasPathSum4() {
        var treeNodes = fromIntArrayWithNullValue(new Integer[]{1, -2, -3, 1, 3, -2, null, -1});
        var actual = solution.hasPathSum(treeNodes, 3);
        assertFalse(actual);
    }

    @Test
    void hasPathSum5() {
        var treeNodes = fromIntArrayWithNullValue(new Integer[]{-2,null,-3});
        var actual = solution.hasPathSum(treeNodes, -5);
        assertTrue(actual);
    }
}