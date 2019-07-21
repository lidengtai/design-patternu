package com.taylor.patterns.singleton;

/**
 * @ClassName Singleton
 * @Description 饿汉式（提前准备好）加载是类加载的时候就初始化实例对象 线程安全
 * @Author lidengtai
 * @Date 2019/5/30 10:23
 * @Version 1.0
 */
public class Singleton {

    //单例模式 只能有一个实例，避免外部创建实例，构造方法private修饰： 只能在本类中使用
    private Singleton(){ }
    public static Singleton singleton =  null;

    static {
        singleton= new Singleton();
    }
    //定义一个供外部访问的方法
    public static Singleton getInstance(){
        System.out.println("饿汉式");
        return singleton;
    }
}
