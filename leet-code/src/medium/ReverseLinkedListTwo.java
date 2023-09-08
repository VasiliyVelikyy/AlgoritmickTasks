package medium;

import domain.ListNode;

import java.util.ArrayList;
import java.util.List;

/*Given the head of a singly linked list and two integers left and right where left <= right,
 reverse the nodes of the list from position left to position right, and return the reversed list.
Example 1:


Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]


Constraints:

The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n*/

/**Обяснение: необходимо перекинуть ссылки предидущего от left к элементу right а ссылку right перекинуть к ссылке элемента, стоящего после right
 * Так же внутри оттрезка от left до right необходимо перекинуть на предидуще стоящий элемент
 * 1->2->3->4->5->6->7
 * В решении необходимо за left-1 итераций дойти до элемента предшествующего left
 * в данном случае это будет 3ка
 * После этого зафиксировать связку как элемент, который нужно сконнектить
 * Указатель обозначающий текущий узед current после данных итераций останеться на цифре 4
 * указатель предшествующей ноды останеться на 3
 * Далее необходимо зафиксировать хвост (tail) на отметке 4, Он нам пригодиться чтобы конец отрезка переманитровать на необходимоый элемент следущий за цифрой 7
 * Далее приступаем к смещению элементов previous и current , дополнительно введя   ListNode next указатель для правильного смещения,
 * у current будем перемеантировать ссылку на previous а так как next зафиксировали, сместим current на отметку next. Количество итарций будет равной right-left (но в сумме спредидущими операциями у нас
 * будет всего один проход)
 * После завершения итераций необходимо conection соеденить с концом отрезка(тоесть с prevNode) , он будет иметь отметку 7 а current будет null тк 7 узел ссылается на пустоту
 * Так же необходимо хвост соеденить с последющим от 7узла элементом, так как current ссылается на пустоту, это и будет нашим элементом
 *
 * left=4 right=7
 * 1->2->3->4->5->6->7
 *       ^
 *       connection
 *             ^
 *             current ->сдвиагется к right
 *
 *           ^
 *           previous-> cдвигается за current
 *           ^ tail зафиксировано
 *
 *   после итераций поменять ссылки
 * */
public class ReverseLinkedListTwo {

    public  ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;

        ListNode prevNode = null;
        ListNode currNode = head;

        while (left > 1) {
            prevNode = currNode;
            currNode = currNode.next;
            left--;
            right--;
        }
        ListNode connection = prevNode;
        ListNode tail = currNode;
        while (right > 0) {
            ListNode next = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = next;

            right--;
        }

        if (connection != null) {
            connection.next = prevNode;
        } else head = prevNode;

        tail.next = currNode;

        return head;
    }

    public List<Integer> getResultVsl(ListNode head){
        List<Integer>result=new ArrayList<>();
        while (head!=null){
            result.add(head.val);
            head=head.next;
        }
        return result;
    }
}
