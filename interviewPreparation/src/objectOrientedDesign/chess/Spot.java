/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package objectOrientedDesign.chess;

/**
 * @author rahul.jaiman
 * @version $Id: Spot.java, v 0.1 2020-05-17 15:16 rahul.jaiman Exp $$
 */
public class Spot {
    private Piece piece;
    private int x;
    private int y;

    public Spot(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}