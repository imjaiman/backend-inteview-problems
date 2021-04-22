package com.practice.backend.dsa.linkedlist;

/**
 * @author rahul.jaiman
 * @version $Id: MergerSortLinkedList.java, v 0.1 2020-05-09 23:00 rahul.jaiman Exp $$
 */
public class MergeSortLinkedList {

    public static ListNode head;

    public static void main(String args[]) {

        head = LinkedListUtil.provideMeLinkedList();
        ListNode headAfterSort = mergeSort(head);
        LinkedListUtil.printLinkedList(headAfterSort);
    }

    //Divide Method
    public static ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode middle = LinkedListUtil.getMiddle(head);
        ListNode middleNext = middle.next;
        middle.next = null;
        ListNode left = mergeSort(head);
        ListNode right  = mergeSort(middleNext);
        return sortedMerge(left,right);

    }

    //Conquer Method
    public static ListNode sortedMerge(ListNode left, ListNode right){
        ListNode result = null;
        if(left == null) return right;
        if(right == null ) return left;

        if(left.data < right.data){
            result = left;
            result.next = sortedMerge(left.next,right);
        }
        if(left.data > right.data){
            result = right;
            result.next = sortedMerge(left,right.next);
        }
        return result;
    }

}