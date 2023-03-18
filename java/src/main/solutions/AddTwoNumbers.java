package main.solutions;

import main.common.Difficulty;
import main.common.LeetCode;
import main.common.ListNode;

import java.util.LinkedList;
import java.util.List;

@LeetCode(
        id = 2,
        name = "Add Two Numbers",
        url = "https://leetcode.com/problems/add-two-numbers/",
        difficulty = Difficulty.MEDIUM
)
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode res = new ListNode();
        ListNode temp = res;

        while (l1 != null || l2 != null || carry == 1) {
            sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return res.next;
    }

}
