package com.taylor.patterns.factory.method;

/**
 * @ClassName Bread
 * @Description 面包
 * @Author lidengtai
 * @Date 2019/5/30 9:15
 * @Version 1.0
 */
public class Bread implements Food {
    @Override
    public void food() {
        System.out.println("生产了一块面包");
    }
}
