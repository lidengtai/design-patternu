package com.taylor.patterns.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description jdk动态代理
 * @Author lidengtai
 * @Date 2019/5/30 15:43
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Class c = car.getClass();
        /**
         * Proxy.newProxyInstance(loader,interfaces,h);
         * loader 类加载器
         * interfaces 实现接口
         * h InvocationHandler
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(c.getClassLoader(),c.getInterfaces(),h);
         m.move();
    }
}
