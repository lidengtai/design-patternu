package com.taylor.patterns.singleton;

/**
 * @ClassName Singleton
 * @Description 懒汉式（延迟加载） 在多线程情况下差生多个对象 线程不安全
 * @Author lidengtai
 * @Date 2019/5/30 10:23
 * @Version 1.0
 */
public class Singleton1 {

    //单例模式 只能有一个实例，避免外部创建实例，构造方法private修饰： 只能在本类中使用
    private Singleton1(){ }
    public static Singleton1 singleton= null;
    //定义一个供外部访问的方法
    public static Singleton1 getInstance(){
        System.out.println("懒汉式");
        if (null == singleton){
            singleton = new Singleton1();
        }
        return singleton;
    }
}
