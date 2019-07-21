package com.taylor.patterns.factory.method;

/**
 * @ClassName Chicken
 * @Description 鸡肉
 * @Author lidengtai
 * @Date 2019/5/30 9:14
 * @Version 1.0
 */
public class Chicken implements Food {
    @Override
    public void food() {
        System.out.println("生产了一只烧鸡");
    }
}
