
package com.example.demo.designPattern.creational.factory_Shape;

/**
 * @author rahul.jaiman
 */
public class ShapeUtil {
    public static void main(String[] args) {
        Shape sh = ShapeFactory.getInstance("Circle");

        System.out.println(sh.area(3));
        Shape sh2 = ShapeFactory.getInstance("Square");
        System.out.println(sh2.area(3));
    }
}