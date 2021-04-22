/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.observer_Youtube;

/**
 * @author rahul.jaiman
 * @version $Id: Subscriber.java, v 0.1 2020-05-10 12:12 rahul.jaiman Exp $$
 */
public class Follower implements Observer {
    private String followerName;

    @Override
    public void update(String str) {
        System.out.print(str+" ");
    }
}