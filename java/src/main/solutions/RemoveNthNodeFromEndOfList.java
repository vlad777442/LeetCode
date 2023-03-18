package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;
import main.common.ListNode;

@LeetCode(
        id = 19,
        name = "Remove Nth Node From End of List",
        url = "https://leetcode.com/problems/remove-nth-node-from-end-of-list/",
        difficulty = Difficulty.MEDIUM
)
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        System.out.println(removeNthFromEnd(listNode, 2));

        ListNode listNode2 = new ListNode(1);
        System.out.println(removeNthFromEnd(listNode2, 1));
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null)
            return head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;

    }
}
