/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.template;

/**
 * @author rahul.jaiman
 * @version $Id: Game.java, v 0.1 2020-05-26 01:44 rahul.jaiman Exp $$
 */
public abstract class Game {
    abstract void initialize();
    abstract void startGame();
    abstract void endGame();
    public final void play(){

        //initialize the game
        initialize();

        //start the game
        startGame();

        //end the game
        endGame();

    }
}