/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package java.oopsConcept.DemoJava8.defaultInterface;

/**
 * @author rahul.jaiman
 * @version $Id: Interface1.java, v 0.1 2020-05-14 15:46 rahul.jaiman Exp $$
 */
public interface Interface1 {

    default void methodDefault(){
        System.out.println("from interface 1");
    }
    default void method2(){
        System.out.println("this is the second method");
    }

    void justAnotherMethod();


    static void staicMethod(){
        System.out.println("this is the static method from the interface");
    }
}