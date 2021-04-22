
package com.example.demo.java.oopsConcept.inheritanceDemo;

/**
 *   if superclass is serializable then subclass is automatically serializable :
 */
public class ChildClass extends ParentClass {

    int value = 10;
    private void privateMethod(){
        System.out.println("this is the private method");
    }

    //we cannot put more restriction on the parent , although we can open it.
    public void restrictMethod(){
        System.out.println("this is the restrictive method");
    }


    //this static method hide the method present in the parent class
    //as this is the static method
    public static void staticMethod(){
        System.out.println("static method");
    }


    public static void main(String[] args) {
     ChildClass c = new ChildClass();
     c.privateMethod();
     System.out.println(c.value);
     ParentClass p = new ChildClass();
     System.out.println(p.value);


    }
}