package com.taylor.patterns.adapter;

/**
 * @ClassName
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/29 11:12
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","beyond xx.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
