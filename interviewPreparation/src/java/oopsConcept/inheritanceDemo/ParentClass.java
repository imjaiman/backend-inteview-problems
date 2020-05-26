/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package java.oopsConcept.inheritanceDemo;

/**
 * @author rahul.jaiman
 * @version $Id: ParentClass.java, v 0.1 2020-05-14 12:13 rahul.jaiman Exp $$
 */
public class ParentClass {
    int value = 10000;
    public void sum(int x, int y) {
        System.out.println("this is the parent class sum " + Math.addExact(x, y));

    }

    private void privateMethod(){
        System.out.println("this is the private method");
    }

    private void restrictMethod(){
        System.out.println("this is the restrictive method");
    }
    public static void staticMethod(){
        System.out.println("static method");
    }

}