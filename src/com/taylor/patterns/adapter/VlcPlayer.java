package com.taylor.patterns.adapter;

/**
 * @ClassName VlcPlayer
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/29 10:59
 * @Version 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
