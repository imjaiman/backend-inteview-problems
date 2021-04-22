/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.companies.sap.PopularCodingProblems;
import java.util.*;

/**
 * @author rahul.jaiman
 * @version $Id: findMedianPart2.java, v 0.1 2020-05-14 00:40 rahul.jaiman Exp $$
 */

class findMedianPart2 {
    PriorityQueue<Integer> minH;
    PriorityQueue<Integer> maxH;

    /** initialize your data structure here. */
    public findMedianPart2() {
        minH = new PriorityQueue<Integer>();
        /* By default Java provides min heap. For max heap, we need to pass in a appropriate comparator */
        maxH = new PriorityQueue<Integer>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        maxH.offer(num);
        minH.offer(maxH.poll());
        if(minH.size()>maxH.size()){
            maxH.offer(minH.poll());
        }
    }

    public double findMedian() {
        if(minH.size()==maxH.size())
            return (double) (maxH.peek()+minH.peek())*0.5 ;
        else
            return (double) maxH.peek();
    }

    public static void main(String[] args) {
        findMedianPart2 f = new findMedianPart2();
        f.addNum(1);
        System.out.println(f.findMedian());
        f.addNum(2);
        System.out.println(f.findMedian());
        f.addNum(3);
        System.out.println(f.findMedian());
        f.addNum(4);
        System.out.println(f.findMedian());
        f.addNum(5);
        System.out.println(f.findMedian());
        f.addNum(6);
        System.out.println(f.findMedian());
        f.addNum(7);
        System.out.println(f.findMedian());
        f.addNum(8);
        System.out.println(f.findMedian());
        f.addNum(9);
        System.out.println(f.findMedian());
        f.addNum(10);
        System.out.println(f.findMedian());
    }
}