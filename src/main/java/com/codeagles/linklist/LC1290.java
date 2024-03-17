package com.codeagles.linklist;

import com.codeagles.model.ListNode;

/**
 * 1290. Convert Binary Number in a Linked List to Integer
 */
public class LC1290  {

    public int getDecimalValue(ListNode head) {
        int res = 0;
        while(head != null) {
            res = (res<<1) | head.val ;
            head = head.next;
        }
        return res;
    }

    public int getDecimalValueV2(ListNode head) {
        int res = 0;
        while(head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }

}
