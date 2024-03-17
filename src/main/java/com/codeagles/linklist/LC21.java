package com.codeagles.linklist;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class LC21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode protect = head;

        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            }else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        head.next = list1 ==null ? list2 : list1;
        return protect.next;
    }
}
