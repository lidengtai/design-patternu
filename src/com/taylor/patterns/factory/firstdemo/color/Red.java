package com.taylor.patterns.factory.firstdemo.color;

/**
 * @ClassName Red
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/29 13:57
 * @Version 1.0
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色......");
    }
}
