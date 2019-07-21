package com.taylor.patterns.factory.method;

/**
 * @ClassName Pig
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 9:49
 * @Version 1.0
 */
public class Pig implements Food {

    @Override
    public void food() {
        System.out.println("生产了一盘猪肉大肠");
    }
}
