/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.objectOrientedDesign.lift;

import com.example.demo.objectOrientedDesign.lift.exception.CantMoveDownException;
import com.example.demo.objectOrientedDesign.lift.exception.CantMoveUpException;

import java.util.LinkedList;

/**
 * @author rahul.jaiman
 * @version $Id: Lift.java, v 0.1 2020-05-05 23:54 rahul.jaiman Exp $$
 */
public class LiftImpl implements Lift {
    private LiftDirection direction;
    private int nextStop;
    private int currentFloor;
    private int peopleInLift;
    private int destination;
    private boolean isLiftIdle;
    private LinkedList<Integer> desinationQueue = null;


    public LiftImpl(int peopleInLift, int destination) {
        this.currentFloor = 0;
        this.nextStop = 0;
        this.direction = LiftDirection.UP;
        this.destination = destination;
        this.peopleInLift = peopleInLift;
        this.isLiftIdle = true;
        desinationQueue = new LinkedList<>();
        desinationQueue.addLast(destination);
    }


    @Override
    public void moveUp(int curFloor, int destFloor) throws CantMoveUpException {

    }

    @Override
    public void moveDown(int curFloor, int destFloor) throws CantMoveDownException {


    }

    @Override
    public boolean isIdle() {
        return isLiftIdle;
    }

    @Override
    public boolean isFull() {
        return this.peopleInLift == LiftConstants.MAX_CAPACITY;
    }

    @Override
    public void start() throws CantMoveUpException {


    }

    @Override
    public void stop() {

    }

    @Override
    public boolean movingUp() {
        return this.direction == LiftDirection.UP;
    }

    @Override
    public boolean movingDown() {
        return this.direction == LiftDirection.DOWN;
    }

}