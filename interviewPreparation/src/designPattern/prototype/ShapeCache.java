/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.prototype;

import java.util.Hashtable;

/**
 * @author rahul.jaiman
 * @version $Id: ShapeCache.java, v 0.1 2020-05-23 11:07 rahul.jaiman Exp $$
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String id) {
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Shape square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Shape rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}