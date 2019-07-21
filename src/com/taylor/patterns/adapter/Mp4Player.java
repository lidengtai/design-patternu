package com.taylor.patterns.adapter;

/**
 * @ClassName Mp4Player
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/29 11:01
 * @Version 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 file:"+fileName);
    }
}
