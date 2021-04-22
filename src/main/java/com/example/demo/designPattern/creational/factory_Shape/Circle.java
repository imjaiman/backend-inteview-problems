/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.designPattern.creational.factory_Shape;

/**
 * @author rahul.jaiman
 * @version $Id: Circle.java, v 0.1 2020-05-14 12:03 rahul.jaiman Exp $$
 */
public class Circle implements Shape{
    @Override
    public double area(int edge) {
        return 3.14*edge*edge;
    }
}