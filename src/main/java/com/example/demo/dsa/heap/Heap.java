package com.example.demo.dsa.heap;

public class Heap {

    private int size;
    private int elementsPresent;
    private int[] heapArray;

    public Heap(int size) {
        this.size = size;
        this.heapArray = new int[size];
        this.elementsPresent = 0;

    }

    public int getParent(int child) {
        if(child==0) return -1;
        return ((child - 1) / 2) ;
    }

    public int getLeftChild(int parent) {
        int index = 2 * parent + 1;
        if (index <= elementsPresent - 1) return index;
        else return -1;
    }

    public int getRightChild(int parent) {
        int index = 2 * parent + 2;
        if (index <= elementsPresent - 1) return index;
        else return -1;
    }


    public int add(int val) {
        if (size > elementsPresent) {
            heapArray[elementsPresent++] = val;
            heapify();
        } else {
            if (val > heapArray[0]) {
                heapArray[0] = val;
                heapify();
            }

        }
        return getMin();
    }

    public int getMin() {

        return  heapArray[0];
    }

    public void heapify() {
        if(elementsPresent==1) return;
        for (int i = elementsPresent / 2; i >= 1; i--) {
            heapifyUtil(i);
        }
    }

    public void heapifyUtil(int index) {
        if (index ==-1) return;
        else {
            int leftChild = getLeftChild(index);
            int rightChild = getRightChild(index);

            if (leftChild != -1 && heapArray[index] > heapArray[leftChild]) {
                swap(index, leftChild);
            }
            if (rightChild != -1 && heapArray[index] > heapArray[rightChild]) {
                swap(index, rightChild);
            }
            heapifyUtil(getParent(index));
        }
    }

    public void swap(int i, int j) {
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }
}