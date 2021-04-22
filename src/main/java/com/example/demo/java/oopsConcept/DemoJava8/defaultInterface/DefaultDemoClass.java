/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.java.oopsConcept.DemoJava8.defaultInterface;

/**
 * @author rahul.jaiman
 * @version $Id: DefaultDemo.java, v 0.1 2020-05-14 15:46 rahul.jaiman Exp $$
 */
public class DefaultDemoClass implements Interface1, Interface2 {

    public static void main(String[] args) {
        DefaultDemoClass d = new DefaultDemoClass();
        d.methodDefault();
        d.method2();
        staicMethod();
        Interface1 one = new DefaultDemoClass();
        one.justAnotherMethod();


    }

    @Override
    public void justAnotherMethod() {
        System.out.println("just another method");
    }

    @Override
    public void methodDefault() {
        Interface1.super.methodDefault();
        Interface2.super.methodDefault();
    }


}