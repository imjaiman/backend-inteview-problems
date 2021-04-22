/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.prototype;

/**
 * @author rahul.jaiman
 * @version $Id: Square.java, v 0.1 2020-05-23 11:07 rahul.jaiman Exp $$
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside draw of Square:");
    }
}