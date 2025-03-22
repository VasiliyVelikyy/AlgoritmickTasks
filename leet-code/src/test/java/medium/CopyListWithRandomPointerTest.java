package medium;

import common.domain.Node;
import org.junit.jupiter.api.Test;

class CopyListWithRandomPointerTest {

    @Test
    void copyRandomList() {
        CopyListWithRandomPointer solution = new CopyListWithRandomPointer();
        Node original = initNodes();
        Node copy = solution.copyRandomList(original);
        System.out.println("Original list:(current node:node pointed by next pointer, node pointed by random pointer)");
        solution.printList(original);
        System.out.println("Copy list:(current node:node pointed by next pointer,node pointed by random pointer)");
        solution.printList(copy);
    }

    private static Node initNodes() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.next = two;
        one.random = five;

        two.next = three;
        two.random = five;

        three.next = four;
        three.random = four;

        four.next = five;
        four.random = null;

        five.next = null;
        five.random = three;

        return one;
    }

    private static Node initNodes2() {
        Node one = new Node(3);
        Node two = new Node(3);
        Node three = new Node(3);

        one.next = two;
        one.random = null;

        two.next = three;
        two.random = one;

        three.next = null;
        three.random = null;

        return one;
    }
}