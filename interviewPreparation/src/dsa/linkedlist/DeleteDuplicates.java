/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package dsa.linkedlist;

import java.util.List;

/**
 * @author rahul.jaiman
 * @version $Id: DeleteDuplicates.java, v 0.1 2020-05-20 16:25 rahul.jaiman Exp $$
 */
public class DeleteDuplicates {
    static ListNode head ;
    public static void main(String[] args) {
        head = LinkedListUtil.provideMeDuplicateLinkedList();
        deleteDuplicates(head);

    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode curNext = head.next;

        while(curNext != null){

            if(cur.data == curNext.data){
                ListNode temp = curNext.next;
                curNext = null;
                curNext = temp;
                if(curNext == null){
                    cur.next = curNext;
                }
            }
            else{
                cur.next = curNext;
                curNext = curNext.next;
                cur = cur.next;

            }
        }
        return  head;
    }
}
