/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.practice.backend.designPattern.adapter;

/**
 * @author rahul.jaiman
 * @version $Id: MediaAdapter.java, v 0.1 2020-05-25 23:51 rahul.jaiman Exp $$
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equals("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
        if(audioType.equals("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("vlc")){
            advancedMediaPlayer.play(fileName);
        }
        if(audioType.equals("mp4")){
            advancedMediaPlayer.play(fileName);
        }

    }
}