/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.creational.factory_Shape;

import sun.security.provider.SHA;

/**
 * @author rahul.jaiman
 * @version $Id: ShapeFactory.java, v 0.1 2020-05-14 12:05 rahul.jaiman Exp $$
 */
public class ShapeFactory {
    public static Shape getInstance(String shape){
        if(shape=="Circle"){
            return new Circle();
        }
        else
            return new Square();
        }

}