package easy.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ImplementQueueUsingMapTest {

    ImplementQueueUsingMap implementQueueUsingStacks = new ImplementQueueUsingMap();

    @Test
    void test() {
        implementQueueUsingStacks.push(1);
        implementQueueUsingStacks.push(2);
        implementQueueUsingStacks.push(3);
        var three = implementQueueUsingStacks.pop();
        var two = implementQueueUsingStacks.pop();
        var one1 = implementQueueUsingStacks.peek();
        var one2 = implementQueueUsingStacks.peek();
        var one3 = implementQueueUsingStacks.pop();
        var empty = implementQueueUsingStacks.empty();

        assertEquals(3, three);
        assertEquals(2, two);
        assertEquals(1, one1);
        assertEquals(1, one2);
        assertEquals(1, one3);
        assertTrue(empty);
    }

}