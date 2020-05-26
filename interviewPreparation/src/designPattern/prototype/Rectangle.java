/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.prototype;

/**
 * @author rahul.jaiman
 * @version $Id: Rectangle.java, v 0.1 2020-05-23 11:07 rahul.jaiman Exp $$
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside draw of Rectangle :");
    }
}