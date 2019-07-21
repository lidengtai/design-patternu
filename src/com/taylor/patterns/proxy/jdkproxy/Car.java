package com.taylor.patterns.proxy.jdkproxy;

/**
 * @ClassName Car
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 15:44
 * @Version 1.0
 */
public class Car implements Moveable{

    @Override
    public void move() {
        try {
            System.out.println("汽车行驶中.............");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
