/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.adapter;

/**
 * @author rahul.jaiman
 * @version $Id: Mp4Player.java, v 0.1 2020-05-25 23:51 rahul.jaiman Exp $$
 */
public class Mp4Player implements AdvancedMediaPlayer {


    @Override
    public void play(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}