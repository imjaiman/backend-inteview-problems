/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.adapter;

/**
 * @author rahul.jaiman
 * @version $Id: AdapterDriver.java, v 0.1 2020-05-26 00:06 rahul.jaiman Exp $$
 */
public class AdapterDriver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","sunshine");
        audioPlayer.play("mp4","in the end");
        audioPlayer.play("vlc","perfect");

    }
}