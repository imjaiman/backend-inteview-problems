/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.companies.amazon;

/**
 * @author rahul.jaiman
 * @version $Id: SmallestInRotatedArray.java, v 0.1 2020-05-23 14:40 rahul.jaiman Exp $$
 */
public class SmallestInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findSmallestInRotatedArray(arr, 0, arr.length - 1));

    }

    //best code ever for the binary search
    private static int findSmallestInRotatedArray(int[] arr, int low, int high) {
        while (low < high) {
                int mid = (high-low)/2 + low;
               if( arr[mid] == arr[high]){
                    high--;
               }
               else if(arr[mid]>arr[high]){
                   low = mid+1;
               }
               else{
                   high = mid;
               }
        }
        return arr[high];

    }
}

