/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.creational.composite_PlayList;

/**
 * @author rahul.jaiman
 * @version $Id: IComponent.java, v 0.1 2020-05-05 11:37 rahul.jaiman Exp $$
 */
public interface IComponent {

    void play();

    void setPlaybackSpeed(float speed);

    String getName();
}