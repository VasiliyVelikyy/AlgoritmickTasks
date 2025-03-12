package easy.binary.binary_tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static easy.utils.TreeNodeUtils.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBinaryTreeTest {
    BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    void isBalanced() {
        var ints = fromIntArrayWithNullValue(new Integer[]{3, 9, 20, null, null, 15, 7});
        var answer = balancedBinaryTree.isBalanced(ints);
        assertTrue(answer);
    }



    @Test
    void isBalanced2() {
        var ints = fromIntArray(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
        var answer = balancedBinaryTree.isBalanced(ints);
        assertFalse(answer);
    }


}