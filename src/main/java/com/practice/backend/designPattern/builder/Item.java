/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.builder;

/**
 * @author rahul.jaiman
 * @version $Id: Item.java, v 0.1 2020-05-23 03:31 rahul.jaiman Exp $$
 */
public interface Item {

    String name();
    Packing packing();
    float price();

}