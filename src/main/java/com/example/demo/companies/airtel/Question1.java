/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.companies.airtel;

/**
 * @author rahul.jaiman
 * @version $Id: Question1.java, v 0.1 2020-05-26 18:44 rahul.jaiman Exp $$
 */
public class Question1 {
    public static void main(String[] args) {
        System.out.println(calculateNumber(new int[]{3,12}));
    }
    public static int calculateNumber(int[] arr){
        int ans = 0;

        for(int i : arr){
            if(checkNumberAsCondition(i)){
                ans++;
            }
        }
        return ans;
    }
    public static boolean checkNumberAsCondition(int x){

        for(int i = 1; i < x ; i++){
            int rev = reverseNumber(i);
            if((rev + i) == x){
                return true;
            }
        }
        return false;
    }
    public static int reverseNumber(int x){
        int rev =0;
        while(x != 0){
            int temp = x %10;
            rev = rev*10 + temp;
            x = x/10;
        }
        return rev;
    }
}