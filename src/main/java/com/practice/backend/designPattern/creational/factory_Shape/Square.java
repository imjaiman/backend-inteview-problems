package com.practice.backend.designPattern.creational.factory_Shape;

/**
 * @author rahul.jaiman
 * @version $Id: Square.java, v 0.1 2020-05-14 12:02 rahul.jaiman Exp $$
 */
public class Square implements Shape{
    @Override
    public double area(int edge) {
        return edge*edge;
    }
}