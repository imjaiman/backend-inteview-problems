/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.objectOrientedDesign.lift;

import com.example.demo.objectOrientedDesign.lift.exception.CantMoveDownException;
import com.example.demo.objectOrientedDesign.lift.exception.CantMoveUpException;

/**
 * @author rahul.jaiman
 * @version $Id: Lift.java, v 0.1 2020-05-06 09:32 rahul.jaiman Exp $$
 */
public interface Lift {

    void moveUp(int curFloor, int destFloor) throws CantMoveUpException;

    void moveDown(int curFloor, int destFloor) throws CantMoveDownException;

    boolean isIdle();

    boolean isFull();

    void start() throws CantMoveUpException;

    void stop();

    boolean movingUp();

    boolean movingDown();

}