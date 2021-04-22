/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.java.oopsConcept.java8.defaultInterface;

/**
 * @author rahul.jaiman
 * @version $Id: Interface2.java, v 0.1 2020-05-14 15:46 rahul.jaiman Exp $$
 */
public interface Interface2 {
    default void methodDefault(){
        System.out.println("from interface 2");
    }
    void justAnotherMethod();
}