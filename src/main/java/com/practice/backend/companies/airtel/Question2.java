
package com.practice.backend.companies.airtel;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(calculateNumber(10));

    }

    private static int calculateNumber(int n) {
        int max = Integer.MIN_VALUE;
        int index =0;
        for (int i = n; i >= 1; i--) {
            int ans = calculateAns(i);
            if (ans> max) {
                max = ans;
                index = i;
            }
        }
        return index;
    }

    private static int calculateAns(int x) {
        int count = 1;
        while (x != 1) {
            if (x % 2 == 0) {
                x = x /2;
            }
            else{
                x = 3*x+1;
            }
            count++;
        }
        return count;
    }
}
