package easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplementStackUsingMapTest {

    ImplementStackUsingMap solution = new ImplementStackUsingMap();

    @Test
    void test() {
        solution.push(1);
        solution.push(2);
        solution.push(3);
        var three = solution.pop();
        var two = solution.pop();
        var one1 = solution.peek();
        var one2 = solution.peek();
        var one3 = solution.pop();
        var empty = solution.empty();

        assertEquals(3, three);
        assertEquals(2, two);
        assertEquals(1, one1);
        assertEquals(1, one2);
        assertEquals(1, one3);
        assertTrue(empty);
    }

}