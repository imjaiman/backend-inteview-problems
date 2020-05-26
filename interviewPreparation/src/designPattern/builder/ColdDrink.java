/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.builder;

/**
 * @author rahul.jaiman
 * @version $Id: ColdDrink.java, v 0.1 2020-05-23 03:33 rahul.jaiman Exp $$
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}