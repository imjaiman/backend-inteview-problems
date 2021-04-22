/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.builder;

/**
 * @author rahul.jaiman
 * @version $Id: Coke.java, v 0.1 2020-05-23 03:38 rahul.jaiman Exp $$
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}