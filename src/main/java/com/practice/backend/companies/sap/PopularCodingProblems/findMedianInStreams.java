/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.companies.sap.PopularCodingProblems;

/**
 * first the currentMedian  is 0;
 * we have two heap minHeap and maxHeap
 * when the first element is added, currentMedian  = first element
 * <p>
 * whenever we are adding element, we take these steps in consideration
 * 1. if data < currentMedian, data should be added in the minHeap.
 * 2. if data > currentMedian, data should be added in the maxHeap.
 * 3. update the current heap, median is the 0th element of the heaps who contains max number of data.
 * 4. size|maxHeap - minHeap| <2, if this happens move the element from the heap to other heap in which less items are present.
 */
public class findMedianInStreams {

    int minCount;
    int maxCount;
    private int[] maxHeap;
    private int[] minHeap;
    private int maxHeapSize;
    private int minHeapSize;
    private double currentMedian;

    public findMedianInStreams() {
        maxHeap = new int[1000];
        minHeap = new int[1000];
        maxHeapSize = maxHeap.length;
        minHeapSize = minHeap.length;
        minCount = -1;
        maxCount = -1;
        currentMedian = 0;
    }


    /*
        real time streaming numbers
    */
    public void addNum(int num) {


        if (num < currentMedian) {
            addToMaxHeap(maxHeap, num);

        } else {
            addToMinHeap(minHeap, num);
        }
        maintainBothHeapSize(minHeap, maxHeap);
        updateMedian(minHeap, maxHeap);

    }

    /*
        this method update the median every time when we get new input from the stream.
     */
    private void updateMedian(int[] minHeap, int[] maxHeap) {
        if (minCount == -1 && maxCount == -1) {
            currentMedian = 0;
            return;
        }

        if (minCount == -1){
            currentMedian = maxHeap[0];
            return;
        }

        if (maxCount == -1){
            currentMedian = minHeap[0];
            return;
        }

        if (maxCount == minCount) {
            currentMedian = (double) (minHeap[0] + maxHeap[0]) / 2;
            return;
        }


        currentMedian = maxCount > minCount ? maxHeap[0] : minHeap[0];
    }

    private void maintainBothHeapSize(int[] minHeap, int[] maxHeap) {
        if (Math.abs(maxCount - minCount) < 2) return;
        if (minCount > maxCount) {
            addToMaxHeap(maxHeap, minHeap[0]);
            minHeap[0] = minHeap[minCount];
            minHeap[minCount--] = 0;
            heapifyMinHeap(minHeap, minCount);

        } else {
            addToMinHeap(minHeap, maxHeap[0]);
            maxHeap[0] = maxHeap[maxCount];
            maxHeap[maxCount--] = 0;
            heapifyMaxHeap(maxHeap, maxCount);
        }
    }
    private void addToMaxHeap(int[] maxHeap, int num) {
        if (maxCount == maxHeapSize - 1) {
            System.out.println("insufficient memory ");
            return;
        }
        maxHeap[++maxCount] = num;
        heapifyMaxHeap(maxHeap, maxCount);
    }

    private void addToMinHeap(int[] minHeap, int num) {
        if (minCount == minHeapSize - 1) {
            System.out.println("insufficient memory ");
            return;
        }
        minHeap[++minCount] = num;
        heapifyMinHeap(minHeap, minCount);

    }

    private void heapifyMaxHeap(int[] maxHeap, int maxCount) {

        //no need to heapify in the case when heap contains only one elment in the heap.
        if (maxCount <1) return;

        for (int index = maxCount / 2; index >= 0; index--) {
            heapifyMaxHeapUtil(maxHeap, index);
        }

    }
    private void heapifyMinHeap(int[] minHeap, int minCount) {
        if (minCount <1) return;

        for (int index = minCount / 2; index >= 0; index--) {
            heapifyMinHeapUtil(minHeap, index);
        }
    }

    private void heapifyMaxHeapUtil(int[] maxHeap, int index) {

        if (index < 0) return;
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild <= maxCount && maxHeap[leftChild] > maxHeap[largest]) {
            largest = leftChild;
        }
        if (rightChild <= maxCount && maxHeap[rightChild] > maxHeap[largest]) {
            largest = rightChild;
        }
        if (largest != index) {
            int temp = maxHeap[index];
            maxHeap[index] = maxHeap[largest];
            maxHeap[largest] = temp;
        }
        if(index==0) return;
        heapifyMaxHeapUtil(maxHeap, (index - 1) / 2);
    }


    private void heapifyMinHeapUtil(int[] minHeap, int index) {
        if (index < 0) return;
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild <= minCount && minHeap[leftChild] < minHeap[smallest]) {
            smallest = leftChild;
        }
        if (rightChild <= minCount && minHeap[rightChild] < minHeap[smallest]) {
            smallest = rightChild;
        }
        if (smallest != index) {
            int temp = minHeap[index];
            minHeap[index] = minHeap[smallest];
            minHeap[smallest] = temp;
        }
        if(index==0) return;
        heapifyMinHeapUtil(minHeap, (index - 1) / 2);
    }

    public double findMedian() {
        return currentMedian;
    }

    public static void main(String[] args) {

        findMedianInStreams f = new findMedianInStreams();
       /* f.addNum(-1);
        System.out.println(f.findMedian());
        f.addNum(-2);
        System.out.println(f.findMedian());
        f.addNum(-3);
        System.out.println(f.findMedian());
        f.addNum(-4);
        System.out.println(f.findMedian());
        f.addNum(-5);
        System.out.println(f.findMedian());*/


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