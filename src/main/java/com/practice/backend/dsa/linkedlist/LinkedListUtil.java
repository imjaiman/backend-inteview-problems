package com.practice.backend.dsa.linkedlist;

/**
 * @author rahul.jaiman
 * @version $Id: LinkedListUtil.java, v 0.1 2020-05-09 23:06 rahul.jaiman Exp $$
 */
public class LinkedListUtil {

    public static ListNode head;

    public static ListNode provideMeLinkedList() {
        head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next = new ListNode(7);
        return head;

    }

    public static ListNode provideMeDuplicateLinkedList() {
        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        return head;

    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int lengthOfLinkedList(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static ListNode getMiddle(ListNode head) {
        if (head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}