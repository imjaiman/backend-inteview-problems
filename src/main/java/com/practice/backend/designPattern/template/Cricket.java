package com.practice.backend.designPattern.template;

/**
 * @author rahul.jaiman
 * @version $Id: Cricket.java, v 0.1 2020-05-26 01:44 rahul.jaiman Exp $$
 */
public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("set 2 team of 11 players each and cricket kit");
    }

    @Override
    void startGame() {
        System.out.println("Team a starts batting and b bowling");
    }

    @Override
    void endGame() {
        System.out.println("winning 6");
    }

}