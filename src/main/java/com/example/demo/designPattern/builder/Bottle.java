/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.designPattern.builder;

/**
 * @author rahul.jaiman
 * @version $Id: Bottle.java, v 0.1 2020-05-23 03:35 rahul.jaiman Exp $$
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}