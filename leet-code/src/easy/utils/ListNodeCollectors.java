package easy.utils;

import common.domain.ListNode;

public class ListNodeCollectors {

    public static ListNode fromArray(int[] arr) {
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int i = 0; i < arr.length; i++) {
            cur.val = arr[i];

            if (i < arr.length-1) {
                cur.next = new ListNode();
                cur = cur.next;
            }
        }
        return head;
    }

    public static ListNode fromArrayWithCycleByPosition(int[] arr, int indexCycle) {
        if (arr.length == 0) {
            return null;
        } else if (arr.length == 1) {
            return new ListNode(arr[0]);
        } else if (indexCycle > arr.length) {
            throw new IllegalArgumentException("indexCycle more then count of elements in array");
        } else {
            ListNode head = new ListNode();
            ListNode cur = head;
            ListNode cycleNode = null;

            for (int i = 0; i < arr.length; i++) {

                cur.val = arr[i];

                if (i == indexCycle) {
                    cycleNode = cur;
                }

                if (i < arr.length - 1) {
                    cur.next = new ListNode();
                    cur = cur.next;
                }


            }
            if (cycleNode != null) {
                cur.next = cycleNode;
            }
            return head;
        }
    }
}
