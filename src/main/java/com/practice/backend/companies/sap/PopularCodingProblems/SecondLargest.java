/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.companies.sap.PopularCodingProblems;

/**
 * @author rahul.jaiman
 * @version $Id: SecongLargest.java, v 0.1 2020-05-13 18:51 rahul.jaiman Exp $$
 */
public class SecondLargest {

    public static void main(String[] args) {
        System.out.println(secondLar(new int[]{5,1,4,3,2}));
    }

    public static int secondLar(int arr[]) {
        int max =Integer.MIN_VALUE;
        int smax =Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i] >max){
                smax = max;
                max = arr[i];
            }
            if(arr[i]>smax && arr[i]<max)
                smax = arr[i];
        }

        return smax;

    }
}