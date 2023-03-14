package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;
import main.common.ListNode;

@LeetCode(
        id = 876,
        name = "Middle of the Linked List",
        url = "https://leetcode.com/problems/middle-of-the-linked-list/",
        difficulty = Difficulty.EASY
)

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);

        System.out.println(middleNode(listNode));
    }
    public static ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast;
//        if (head.next != null)
//            fast = head.next;
//        else return head;
//
//        while (fast.next != null && fast.next.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow.next;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
