/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.designPattern.prototype;

/**
 * @author rahul.jaiman
 * @version $Id: PrototypeDriverClass.java, v 0.1 2020-05-23 11:08 rahul.jaiman Exp $$
 */
public class PrototypeDriverClass {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape1 = ShapeCache.getShape("1");
        Shape clonedShape2 = ShapeCache.getShape("2");
        Shape clonedShape3 = ShapeCache.getShape("3");
        clonedShape1.draw();
        clonedShape2.draw();
        clonedShape3.draw();

    }
}