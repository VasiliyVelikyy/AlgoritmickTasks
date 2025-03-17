package easy.stack;


import java.util.HashMap;
import java.util.Map;

public class ImplementStackUsingMap {
    private final Map<Integer, Integer> map = new HashMap<>();
    int index = -1;

    public ImplementStackUsingMap() {

    }

    public void push(int x) {
        map.put(++index, x);
    }

    public int pop() {
        if (index == -1) {
            return 0;
        }
        var retval = map.get(index);
        map.remove(index);
        index--;
        return retval;
    }

    public int peek() {
        if (map.isEmpty()) return -1;
        else {
            return map.get(index);
        }
    }

    public boolean empty() {
        return map.isEmpty();
    }
}
