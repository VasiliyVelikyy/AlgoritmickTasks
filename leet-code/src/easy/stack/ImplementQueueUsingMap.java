package easy.stack;

import java.util.HashMap;
import java.util.Map;

//My solution
//Runtime 0 ms Beats 100.00%
//Memory 41.50 MB Beats 51.02%
public class ImplementQueueUsingMap {

    private final Map<Integer, Integer> map = new HashMap<>();
    int index = Integer.MAX_VALUE;
    int count = 0;

    public ImplementQueueUsingMap() {

    }

    public void push(int x) {
        map.put(index--, x);
        count++;
    }

    public int pop() {
        if (index == -1) {
            return 0;
        }
        var retval = map.get(index + count);
        map.remove(index + count);
        count--;
        return retval;
    }

    public int peek() {
        if (map.isEmpty()) return -1;
        else {
            return map.get(index + count);
        }
    }

    public boolean empty() {
        return map.isEmpty();
    }
}
