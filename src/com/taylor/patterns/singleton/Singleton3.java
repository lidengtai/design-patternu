package com.taylor.patterns.singleton;

/**
 * @ClassName Singleton3
 * @Description 双检锁/双重校验锁
 * @Author lidengtai
 * @Date 2019/5/31 11:25
 * @Version 1.0
 */
public class Singleton3 {
    private volatile static Singleton3 singleton;
    private Singleton3 (){}
    public static Singleton3 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
