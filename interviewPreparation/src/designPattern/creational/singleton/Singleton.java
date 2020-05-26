package designPattern.creational.singleton;

import java.io.Serializable;

/**
 * @author rahul.jaiman
 * @version $Id: Singleton.java, v 0.1 2020-05-14 11:32 rahul.jaiman Exp $$
 */
public class Singleton implements Cloneable, Serializable {

    private static volatile Singleton singletonInstance = null;

    private Singleton() {

    }

    public static Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }

    /*
     this prevent the cloning of the singleton object.
     throws exception while cloning it.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton class doesn't support cloning of object.");
    }


    /*
    it will the return the same object if program try to create singleton object while deserialization
     */
    protected Object readResolve(){
        return singletonInstance;
    }

}