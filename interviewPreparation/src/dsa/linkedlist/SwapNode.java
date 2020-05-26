package dsa.linkedlist;

/**
 * @author rahul.jaiman
 * @version $Id: SwapNode.java, v 0.1 2020-05-08 10:44 rahul.jaiman Exp $$
 */

//this is the code to swap two nodes in the linkedlist
public class SwapNode {

    private static ListNode head;

    public static ListNode swap(ListNode head, int x, int y) {

        if (x == y) return head;

        ListNode prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        ListNode prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        //atleast one of the node is not present, so return null
        if (currX == null || currY == null) {
            return null;
        }

        if (prevX != null) prevX.next = currY;
        else head = currY;

        if (prevY != null) prevY.next = currX;
        else head = currX;

        ListNode temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;

    }

    public static void main(String args[]) {
        head = new ListNode(10);
        head.next = new ListNode(15);
        head.next.next = new ListNode(12);
        head.next.next.next = new ListNode(13);
        head.next.next.next.next = new ListNode(20);
        head.next.next.next.next.next = new ListNode(14);
        ListNode tempHead = swap(head, 12, 13);
        LinkedListDemo.printLL(tempHead);


    }
}