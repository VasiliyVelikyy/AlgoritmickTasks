package easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementQueueUsingMapTest {
    ImplementQueueUsingMap solution = new ImplementQueueUsingMap();

    @Test
    void test() {
        solution.push(1);
        solution.push(2);
        solution.push(3);

        var one = solution.pop();
        var two = solution.pop();
        var three1 = solution.peek();
        var three2 = solution.peek();
        var three3 = solution.pop();
        var empty = solution.empty();

        assertEquals(1, one);
        assertEquals(2, two);
        assertEquals(3, three1);
        assertEquals(3, three2);
        assertEquals(3, three3);
        assertTrue(empty);
    }



    @Test
    void test2() {
        solution.push(1);
        solution.push(2);
        solution.push(3);

        var one = solution.pop();
        var two = solution.pop();
        solution.push(4);

        var three1 = solution.peek();
        var three2 = solution.peek();
        var three3 = solution.pop();
        var empty = solution.empty();

        assertEquals(1, one);
        assertEquals(2, two);
        assertEquals(3, three1);
        assertEquals(3, three2);
        assertEquals(3, three3);
        assertFalse(empty);
    }

}