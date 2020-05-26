package dsa.linkedlist;
import  java.util.*;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;

/**
 * @author rahul.jaiman
 * @version $Id: LinkedListDemo.java, v 0.1 2020-05-05 13:37 rahul.jaiman Exp $$
 */
public class LinkedListDemo {
    private static ListNode head = null;
    private static ListNode head2 = null;


    //delete the nthNode from the last of linkedlist
    public static ListNode removeNthFromEnd(ListNode head, int nthNodeToDelete) {

        if (head == null) return null;

        int linkedListLength = lengthOfLinkedList(head);
        if (nthNodeToDelete >= linkedListLength) {
            return null;
        }

        int count = 1;
        ListNode cur = head;
        while (count < nthNodeToDelete) {
            cur = cur.next;
            count++;
        }

        ListNode prev = null, presentNode = head;
        while (cur.next != null) {
            prev = presentNode;
            presentNode = presentNode.next;
            cur = cur.next;
        }
        prev.next = presentNode.next;
        presentNode = null;
        return head;
    }

    //calculate the length of linkedlist
    public static int lengthOfLinkedList(ListNode cur) {
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //get the inserction of the two linkedlist
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    //find the position of Node in the linkedlist
    public static int findPosition(ListNode head, int val){

        if(head == null) return  -1;

        int position = 0;
        while(head !=null){
            position++;
            if(head.data == val){
                return position;
            }
            head = head.next;
        }
        return -1;
    }

    //print the linkedlist

    public static void printLL(ListNode head){
        if(head== null) System.out.print(" Null linkedList or nodes are not present to swap");
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static ListNode provideMeLinkedList(){
        return head;
    }


    public static void main(String args[]) {
        head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(3);

    }
}