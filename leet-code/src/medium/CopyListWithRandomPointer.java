package medium;

import java.util.HashMap;


/*A linked list of length n is given such that each node contains an additional random pointer,
 which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has
its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should
 point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state.
  None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x
 and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of
 [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.


Example 1:


Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:


Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:



Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]


Constraints:

0 <= n <= 1000
-104 <= Node.val <= 104
Node.random is null or is pointing to some node in the linked list.*/
public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        Solution solution = new Solution();
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

class Solution {

    HashMap<Node, Node> nodes = new HashMap<>();


    //First solution Time O(n), Space O(n)
    public Node copyRandomList(Node head) {
        firstPass(head);
        secondPass(head);
        return nodes.get(head);
    }

    // НЕДОДЕЛАН Second solution Time O(n), Space O(1)
    public Node copyRandomListTwo(Node head) {
        //firstPass перемонтировать next ссылки
        Node firstPassCurrentElem = head;
        while (firstPassCurrentElem != null) {
            int copyVal = head.val;
            Node copyMember = new Node(copyVal);
            firstPassCurrentElem.next=copyMember;              //перемонтировать, у оригинала в поле next указать клона а
            copyMember.next=firstPassCurrentElem.next; //у клона указать ссылку на след элемент следующего оригинала, таким робразом добавяться доп звенья
                                             //возможно поменять местами
            firstPassCurrentElem = firstPassCurrentElem.next;
        }

        //secondPass перемонтировать random ссылки
        Node secondPassCurrentElem = head; //оригинал
        while (secondPassCurrentElem != null) {
            Node clone = secondPassCurrentElem.next;
            clone.random = secondPassCurrentElem.random; //клону установить ссылку на рандом оригинала
            secondPassCurrentElem = secondPassCurrentElem.next.next; //пройти по цепочке 2 раза (взять оригинал)
        }


        //thirdPass
        Node thirdPassCurrentElem = head;
        while (thirdPassCurrentElem != null) {
            Node clone = thirdPassCurrentElem.next;
            thirdPassCurrentElem.next=clone.next;
            clone.next=clone.next.next;

            thirdPassCurrentElem=thirdPassCurrentElem.next.next;
        }

        return head.next;
    }


    private void firstPass(Node head) {
        Node currentElem = head;
        while (currentElem != null) {
            linking(currentElem);
            currentElem = currentElem.next;
        }
    }

    private void linking(Node head) {
        int copyVal = head.val;
        Node copyMember = new Node(copyVal);
        nodes.put(head, copyMember);
    }


    private void secondPass(Node head) {
        Node currentElem = head;
        while (currentElem != null) {
            Node cloneHead = nodes.get(currentElem);
            cloneHead.next = (currentElem.next != null) ? nodes.get(currentElem.next) : null; //соеденить след клона с предидущим
            cloneHead.random = (currentElem.random != null) ? nodes.get(currentElem.random) : null; //соеденить рандом клона с предидущим
            currentElem = currentElem.next;
        }
    }

    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + ":");
            if (head.next != null)
                System.out.print(head.next.val);
            else
                System.out.print("NULL");
            if (head.random != null)
                System.out.print("," + head.random.val);
            else
                System.out.print(",NULL");
            System.out.println();
            head = head.next;
        }
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
