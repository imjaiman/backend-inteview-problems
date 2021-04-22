/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.java.oopsConcept.inheritanceDemo;

/**
 * @author rahul.jaiman
 * @version $Id: OverRiding.java, v 0.1 2020-05-14 12:13 rahul.jaiman Exp $$
 */
public class OverRiding extends ParentClass {


    //if you make the sum method static in its parent class,
    //then it will throw compile time error as static method cannot override.
    @Override
    public void sum(int x, int y){
        System.out.println("this is the child class sum "+Math.subtractExact(x,y));
    }

    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        parentObj.sum(3,5);
        parentObj = new OverRiding();
        parentObj.sum(3,5);
        OverRiding childObj = new OverRiding();
        childObj.sum(3,4);


    }
}