/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.builder;

/**
 * @author rahul.jaiman
 * @version $Id: Pepsi.java, v 0.1 2020-05-23 03:37 rahul.jaiman Exp $$
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }


    @Override
    public float price() {
        return 35.0f;
    }
}