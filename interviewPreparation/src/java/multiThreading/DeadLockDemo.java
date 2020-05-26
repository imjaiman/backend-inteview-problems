/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package java.multiThreading;

/**
 * @author rahul.jaiman
 * @version $Id: DeadLockDemo.java, v 0.1 2020-05-17 16:21 rahul.jaiman Exp $$
 */
public class DeadLockDemo {
    static Object lock1 = new Object();
    static Object lock2 = new Object();


    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();

        t1.start();
        t2.start();

    }
    public static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("holding lock1");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("holding lock 2");
                }
            }

        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (DeadLockDemo.lock2){
                System.out.println("holding lock 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("holding lock 2 and 1");
                }
            }
        }
    }
}