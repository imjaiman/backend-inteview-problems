/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.template;

/**
 * @author rahul.jaiman
 * @version $Id: Football.java, v 0.1 2020-05-26 01:44 rahul.jaiman Exp $$
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("set a goal and football ground");
    }

    @Override
    void startGame() {
        System.out.println("chasing the football");
    }

    @Override
    void endGame() {
        System.out.println("winning goal in football");
    }
}