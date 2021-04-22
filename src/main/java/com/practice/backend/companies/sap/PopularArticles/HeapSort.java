/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.companies.sap.PopularArticles;

import java.util.Arrays;

/**
 Heap Sort is the inplace sort i.e it doesnt use extra space for sorting.
 heap sort in not stable, means two objects will the same key may not appear as the input
 creating heap = O(n)
 heapify = O(logn)
 Complexity [Best case =  O(nLogn); Worst Case = O(nLogn)]
 */
public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;


        sort(arr);
    }

    public static void sort(int [] arr){
        int n = arr.length;
        for(int i =n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        for(int i = n-1;i>0;i--){


            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
        Arrays.stream(arr).forEach(i-> System.out.println(i));


    }
    public static void heapify(int[] arr, int n, int i){

        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<n&& arr[l]>arr[largest]){
            largest = l;
        }
        if(r<n&& arr[r]>arr[largest]){
            largest = r;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] =temp;
            heapify(arr,n,largest);
        }

    }
}