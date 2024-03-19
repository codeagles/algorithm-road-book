package com.codeagles.linklist;

import com.codeagles.model.ListNode;

/**
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 */
public class LC92 {
    //头插法
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode protectNode = new ListNode();
        protectNode.next = head;
        //找到前置节点
        ListNode pre = protectNode;
        for(int i =0 ; i < left -1; i++) {
            pre = pre.next;
        }

        ListNode curr = pre.next;
        ListNode next;
        for(int i = 0; i < right -left;  i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return protectNode.next;

    }
}
