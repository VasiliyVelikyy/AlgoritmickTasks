package easy.stack;


/*
* 225. Implement Stack using Queues
Easy

Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of
*  a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.


Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False


Constraints:

1 <= x <= 9
At most 100 calls will be made to push, pop, top, and empty.
All the calls to pop and top are valid.


Follow-up: Can you implement the stack using only one queue?
* */

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class ImplementStackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    //My solution
    //Runtime 0 ms Beats 100.00%
    //Memory 41.23 MB Beats 81.47%
    public ImplementStackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if (q1.isEmpty() && q2.isEmpty()) {
            q1.add(x);
        } else if (q2.isEmpty()) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
        } else {
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
        }
    }

    public int pop() {
        Integer polled;
        if (q1.isEmpty()) {
            polled = q2.poll();
        } else {
            polled = q1.poll();
        }
        if (polled == null) {
            throw new NoSuchElementException();
        }
        return polled;
    }

    public int top() {
        Integer top;
        if (q1.isEmpty()) {

            top = q2.peek();
        } else {
            top = q1.peek();
        }
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }


    //Other Solution one queue
    /*
    *   private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        for (int i=1; i<queue.size(); i++)
            queue.add(queue.remove());
    }

    public void pop() {
        queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
    * */
}

