package com.taylor.patterns.factory.firstdemo.shape;

/**
 * @ClassName Square
 * @Description 正方形
 * @Author lidengtai
 * @Date 2019/5/29 11:45
 * @Version 1.0
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形............");
    }
}
