/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.java.oopsConcept.innerClassDemo;

/**
 * @author rahul.jaiman
 * @version $Id: StaticInnerClassDemo.java, v 0.1 2020-05-14 12:34 rahul.jaiman Exp $$
 */
public class StaticInnerClassDemo {

    static class StaticInnerClass{

        public void methodOfStaticInnerClass(){
            System.out.println("from simple method of static inner class");
        }
        public static void staticMethodOfStaticInnerClass(){
            System.out.println("from static method of static inner class");
        }
    }

    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.methodOfStaticInnerClass();
    }
}