/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.companies.sap.PopularArticles;

/**
 * @author rahul.jaiman
 * @version $Id: Sort012.java, v 0.1 2020-05-13 12:11 rahul.jaiman Exp $$
 */
public class Sort012 {

    static int[] arr = new int[]{1,1,1,2,0,0,0 ,2};

    public static void sort(int[] arr) {

        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid<=high){
            int n = arr[mid];
            switch (n) {
                case 0:
                    swap(low,mid);
                    low++;
                    mid++;

                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(mid,high);
                    high--;
                    break;

            }
        }

    }

    public static void main(String[] args) {
        sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void swap(int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}