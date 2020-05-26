/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.creational.factory_Shape;

/**
 * @author rahul.jaiman
 * @version $Id: ShapeUtil.java, v 0.1 2020-05-14 12:07 rahul.jaiman Exp $$
 */
public class ShapeUtil {
    public static void main(String[] args) {
        Shape sh = ShapeFactory.getInstance("Circle");

        System.out.println(sh.area(3));
        Shape sh2 = ShapeFactory.getInstance("Square");
        System.out.println(sh2.area(3));
    }
}