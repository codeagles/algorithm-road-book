package com.codeagles.linklist;

import com.codeagles.model.ListNode;

public class LC2 {
    public static void main(String[] args) {
        LC2 lc2 = new LC2();
        ListNode listNode = lc2.addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))),
                new ListNode(9, new ListNode(9, new ListNode(9))));

        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode res = new ListNode();
        res = dummy;
        int flag = 0;
        while(list1 != null || list2 != null) {
            int x = list1 == null ? 0 : list1.val;
            int y = list2 == null ? 0 : list2.val;
            int num =x + y + flag;
            if(num <= 9) {
                res.next = new ListNode(num);
                res = res.next;
                flag = 0;
            }else {
                int a = num % 10;
                res.next = new ListNode(a);
                res = res.next;
                flag = 1;
            }
            if (list1 != null) list1 = list1.next;
            if (list2 != null) list2 = list2.next;
        }

        if(flag == 1) {
            res.next = new ListNode(1);
        }
        return dummy.next;
    }
}
