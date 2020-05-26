/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.prototype;

/**
 * @author rahul.jaiman
 * @version $Id: Shape.java, v 0.1 2020-05-23 11:06 rahul.jaiman Exp $$
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone(){
        Object clone = null;
        try{
           clone =  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}