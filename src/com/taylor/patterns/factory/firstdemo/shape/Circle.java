package com.taylor.patterns.factory.firstdemo.shape;

/**
 * @ClassName Circle
 * @Description 圆形
 * @Author lidengtai
 * @Date 2019/5/29 11:45
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形......");
    }
}
