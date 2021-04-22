/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.designPattern.builder;

/**
 * @author rahul.jaiman
 * @version $Id: Wrapper.java, v 0.1 2020-05-23 03:34 rahul.jaiman Exp $$
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}