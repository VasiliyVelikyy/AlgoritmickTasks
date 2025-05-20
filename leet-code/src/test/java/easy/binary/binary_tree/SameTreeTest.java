package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.TreeNodeCollectors.fromIntArrayWithNullValue;

class SameTreeTest {
    SameTree solution = new SameTree();

    @Test
    void isSameTree() {
        var first = fromIntArrayWithNullValue(new Integer[]{1, 2, 3});
        var second = fromIntArrayWithNullValue(new Integer[]{1, 2, 3});
        var answer = solution.isSameTree(first, second);
        assertTrue(answer);
    }

    @Test
    void isSameTree2() {
        var first = fromIntArrayWithNullValue(new Integer[]{1, 2});
        var second = fromIntArrayWithNullValue(new Integer[]{1, null, 2});
        var answer = solution.isSameTree(first, second);
        assertFalse(answer);
    }

    @Test
    void isSameTree3() {
        var first = fromIntArrayWithNullValue(new Integer[]{1, 2, 1});
        var second = fromIntArrayWithNullValue(new Integer[]{1, 1, 2});
        var answer = solution.isSameTree(first, second);
        assertFalse(answer);
    }

    @Test
    void isSameTree4() {
        var first = fromIntArrayWithNullValue(new Integer[]{2, 2, 2, null, 2, null, null, 2});
        var second = fromIntArrayWithNullValue(new Integer[]{2, 2, 2, 2, null, 2, null});
        var answer = solution.isSameTree(first, second);
        assertFalse(answer);
    }

    @Test
    void isSameTree5() {
        var second = fromIntArrayWithNullValue(new Integer[]{0});
        var answer = solution.isSameTree(null, second);
        assertFalse(answer);
    }

    @Test
    void isSameTree6() {
        var first = fromIntArrayWithNullValue(new Integer[]{1, null, 2});
        var second = fromIntArrayWithNullValue(new Integer[]{1});
        var answer = solution.isSameTree(first, second);
        assertFalse(answer);
    }
}