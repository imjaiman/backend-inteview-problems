/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.builder;

/**
 * @author rahul.jaiman
 * @version $Id: ChickenBurger.java, v 0.1 2020-05-23 03:37 rahul.jaiman Exp $$
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.f;
    }
}