package com.taylor.patterns.singleton;

/**
 * @ClassName Singleton2
 * @Description 内部静态类
 * @Author lidengtai
 * @Date 2019/5/30 11:04
 * @Version 1.0
 */
public class Singleton2 {

    private Singleton2(){}

    //内部类不加载，使用的时候才会去主动调用 实例对象
    private static class InnerClass{
        private static Singleton2 singleton2 = new Singleton2();
    }
    public static Singleton2 getInstance(){
        System.out.println("内部静态类");
        return InnerClass.singleton2;
    }
}
