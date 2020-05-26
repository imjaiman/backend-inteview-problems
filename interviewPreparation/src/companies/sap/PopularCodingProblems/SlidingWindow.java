/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package companies.sap.PopularCodingProblems;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author rahul.jaiman
 * @version $Id: SlidingWindow.java, v 0.1 2020-05-16 11:57 rahul.jaiman Exp $$
 */
public class SlidingWindow {
    public static void findMaxInWindow(int arr[], int k){
        PriorityQueue<Integer> pq  =new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>=k){
                System.out.print(pq.peek()+" ");
                pq.remove(arr[i+1-k]);
            }

        }


    }

    public static void main(String[] args) {
        int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int K = 4;
        findMaxInWindow(arr,K);
    }
}

