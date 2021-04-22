/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.observer_Youtube;

/**
 * @author rahul.jaiman
 * @version $Id: Subjecy.java, v 0.1 2020-05-10 12:11 rahul.jaiman Exp $$
 */
public interface Subject {
    void registerObserver(Observer observer) ;

    void removeObserver(Observer observer);

    void notifyObservers();
}