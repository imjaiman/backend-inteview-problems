/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.template;

/**
 * @author rahul.jaiman
 * @version $Id: TemplateDriver.java, v 0.1 2020-05-26 01:44 rahul.jaiman Exp $$
 */
public class TemplateDriver {
    public static void main(String[] args) {
        Game g = new Cricket();
        g.play();
        g = new Football();
        g.play();
    }
}