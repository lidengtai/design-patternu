package com.taylor.patterns.factory.firstdemo.shape;

/**
 * @ClassName Rectangle
 * @Description 长方形
 * @Author lidengtai
 * @Date 2019/5/29 11:44
 * @Version 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("长方形..............");
    }
}
