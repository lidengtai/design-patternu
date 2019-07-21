package com.taylor.patterns.singleton;

/**
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 10:32
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton2.getInstance());
    }
}
