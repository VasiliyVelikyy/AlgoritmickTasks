package utility;

import common.domain.ListNode;

public class CollectorListNodeToString {
    public static String getStringValFromListNode(ListNode answer) {
        StringBuilder stringBuilder = new StringBuilder("[");
        while (answer != null) {
            stringBuilder.append(answer.val).append(",");
            answer = answer.next;
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
