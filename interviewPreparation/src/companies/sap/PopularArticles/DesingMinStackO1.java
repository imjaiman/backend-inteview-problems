/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package companies.sap.PopularArticles;

import java.util.Stack;

/**
 * @author rahul.jaiman
 * @version $Id: DesingMinStackO1.java, v 0.1 2020-05-13 18:28 rahul.jaiman Exp $$
 */
public class DesingMinStackO1 {

    static Stack<Integer> stk = new Stack<>();
    static int min=Integer.MIN_VALUE;

    public static void push(int x) {
        if (stk.isEmpty()) {
            min = x;
            stk.push(x);

        } else {
            if (x >= min) {
                stk.push(x);


            } else {
                stk.push(2 * x - min);

                min = x;
            }
        }
        System.out.println("element inserted " + x);

    }

    public static void pop() {
        int y = stk.pop();
        if(y <min) {
            min = 2*min - y;
        }
        System.out.println("element poped"+y);
    }

    public static void getMin() {

        System.out.println(min);

    }

    public static void peek() {
        System.out.println(stk.peek());
    }

    public static void main(String[] args) {

        push(3);
        push(5);
        getMin();
        push(2);
        push(1);
        getMin();
        pop();
        getMin();
        pop();
        peek();
    }
}