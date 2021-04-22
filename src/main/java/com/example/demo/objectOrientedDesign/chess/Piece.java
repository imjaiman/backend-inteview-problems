/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.objectOrientedDesign.chess;

/**
 * @author rahul.jaiman
 * @version $Id: Piece.java, v 0.1 2020-05-17 15:17 rahul.jaiman Exp $$
 */
public abstract class Piece {
    private boolean killed = false;
    private boolean white = false;

    public Piece(boolean white){
        this.white = white;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public abstract boolean canMove(Board board, Spot start, Spot end);


}