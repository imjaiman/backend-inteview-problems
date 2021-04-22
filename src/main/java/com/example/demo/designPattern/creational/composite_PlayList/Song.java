/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.designPattern.creational.composite_PlayList;

/**
 * @author rahul.jaiman
 * @version $Id: Song.java, v 0.1 2020-05-05 11:38 rahul.jaiman Exp $$
 */
public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public void setPlaybackSpeed(float speed){
        this.speed = speed;
    }

    public void play(){
        System.out.print(this.songName+ "Song is started");
    }

    public String getName(){
        return this.songName;
    }

    public String getArtist(){
        return this.artist;
    }
}
