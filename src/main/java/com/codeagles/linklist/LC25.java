package com.codeagles.linklist;

/**
 * 给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
 *
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 */
public class LC25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode protect = new ListNode(0, head);
        ListNode last = protect;
        //分组遍历
        while (head != null) {
            //1.分组（往后走K-1步，找到一组）
            // 一组的开头head，结尾end
            ListNode end = getEnd(head, k);
            if(end == null) break;
            ListNode nextGroupHead = end.next;
            // 2. 一组内部翻转
            reverse(head, nextGroupHead);
            //3. 更新每组跟前一组、后一组之间的边
            last.next = end;
            head.next = nextGroupHead;
            last = head;
            head = nextGroupHead;
        }
        return protect.next;
    }

    //返回k-1之后的结点，返回null表示不够k个
    private ListNode getEnd(ListNode head, int k) {
        while(head != null) {
            k--;
            if (k == 0) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    //翻转从head到stop的链表（左闭右开）
    private void reverse(ListNode head, ListNode stop) {
        ListNode last = head;
        head = head.next;
        while (head != stop) {
            ListNode nextHead = head.next;
            head.next = last;
            last = head;
            head = nextHead;
        }
    }
}
