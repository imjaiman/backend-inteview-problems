/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.adapter;

/**
 * @author rahul.jaiman
 * @version $Id: VlcPlayer.java, v 0.1 2020-05-25 23:50 rahul.jaiman Exp $$
 */
public class VlcPlayer implements AdvancedMediaPlayer {


    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
}