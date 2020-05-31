/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package companies.sap.PopularArticles;

import java.util.Arrays;

/**
 * Quick Sort is the in place sort i.e it doesnt use extra space for sorting.
 * heap sort in stable, means two objects will the same key will appeat as the input.
 * Complexity [Best case =  O(nLogn); Worst Case = O(n^2)]
 */
public class QuickSort {

    public static void sort(int arr[], int l , int h) {

        while(h>l){
            int partition = partition(arr, l, h);
            sort(arr,l,partition-1);
            sort(arr,partition+1,h);

        }
    }

    public static int partition(int[] arr, int l , int h) {
        int pivot = arr[h];
        int pIndex = l-1;
        for(int j = l;j<h;j++){
            if(arr[j]<pivot){

                pIndex++;
                int temp = arr[pIndex];
                arr[pIndex] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[pIndex+1];
        arr[pIndex+1]= arr[h];
        arr[h] = temp;

        return pIndex+1;

    }

    public static void main(String[] args) {

        sort(new int[]{10, 7, 8, 9, 1, 5},0,5);
    }

    public void printArray(int[] arr) {
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}