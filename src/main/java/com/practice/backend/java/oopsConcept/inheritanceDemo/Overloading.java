/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.java.oopsConcept.inheritanceDemo;

/**
 * @author rahul.jaiman
 * @version $Id: Overloading.java, v 0.1 2020-05-14 12:12 rahul.jaiman Exp $$
 */
public class Overloading {

    public static void main(String args[]) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.add(2,3));
        System.out.println(overloading.add(2,3,3));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public  static int add(int x, int y, int z) {
        return x + y + z;
    }
}