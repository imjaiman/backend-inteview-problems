/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package java.multiThreading;

import java.util.concurrent.Semaphore;

/**
 * @author rahul.jaiman
 * @version $Id: Semaphore.java, v 0.1 2020-05-15 19:31 rahul.jaiman Exp $$
 */
class SharedResource {
    static int count = 0;
}

class MyThread extends Thread {
    Semaphore sem;
    String ThreadName;

    public MyThread(Semaphore sem, String ThreadName) {
        super(ThreadName);
        this.sem = sem;
        this.ThreadName = ThreadName;
    }

    @Override
    public void run() {
        //run by thread A
        if (this.getName().equals("A")) {
            System.out.println("Thread A started");

            try {
                System.out.println("Thread A waiting for Permit");
                sem.acquire();
                System.out.println("Thread A got the Permit");
                for (int i = 0; i < 5; i++) {
                    SharedResource.count++;
                    System.out.println("count due to A " + SharedResource.count);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread A releasing permit");
            sem.release();

        }
        //run by thread B
        else {
            System.out.println("Thread A started");
            try {

                System.out.println("Thread B waiting for the permit");
                sem.acquire();
                System.out.println("Thread B got the permission");
                for (int i = 0; i < 5; i++) {
                    SharedResource.count--;
                    System.out.println("count due to B" + SharedResource.count);
                    Thread.sleep(5);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread B releases the permit");
            sem.release();
        }
    }

}

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        MyThread t1 = new MyThread(semaphore, "A");
        MyThread t2 = new MyThread(semaphore, "B");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("share count " + SharedResource.count);

    }
}