package dsa.linkedlist;

/**
 * @author rahul.jaiman
 * @version $Id: ReverseLinkedListInGroup.java, v 0.1 2020-05-10 00:21 rahul.jaiman Exp $$
 */
public class ReverseLinkedListInGroup {

    public static ListNode head;

    public static void main(String args[]) {
        head = LinkedListUtil.provideMeLinkedList();
        int k = 3;
        ListNode headAfterReverseInGroup = reverseInGroup(head, k);
        LinkedListUtil.printLinkedList(headAfterReverseInGroup);
    }


    public static ListNode reverseInGroup(ListNode head, int k) {

        ListNode cur = head;
        ListNode currPrev = null;
        ListNode currNext = null;

        int count = 0;
        while (count < k && cur != null) {
            currNext = cur.next;
            cur.next = currPrev;
            currPrev = cur;
            cur = currNext;
            count++;
        }
        if (currNext != null)
            head.next = reverseInGroup(currNext, k);

        return currPrev;

    }
}