/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package designPattern.creational.composite_PlayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rahul.jaiman
 * @version $Id: Playlist.java, v 0.1 2020-05-05 11:38 rahul.jaiman Exp $$
 */
public class Playlist implements IComponent {
    public String playlistName;
    public List<IComponent> playlist = new ArrayList();
    public List<Song> songsInPlayList = new ArrayList<>();
    public float playListSpeed = 1;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void setPlaybackSpeed(float speed){
        this.playListSpeed = speed;
    }

    public String getName(){
        return this.playlistName;
    }

    public void add(Song song){
        this.songsInPlayList.add(song);

    }

    public void add(Playlist playlist){
        this.playlist.add(playlist);

    }
    public void play(){
        System.out.print(this.playlistName+ "PlayList is started");
    }

}