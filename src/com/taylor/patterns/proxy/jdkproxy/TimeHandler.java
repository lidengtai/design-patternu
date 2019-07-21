package com.taylor.patterns.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

/**
 * @ClassName TimeHandler
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 15:29
 * @Version 1.0
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy 被代理的对象
     * @param method 被代理的方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long begin = System.currentTimeMillis();
        System.out.println("汽车开始行驶......");
        method.invoke(target);
        long end = System.currentTimeMillis();
        System.out.println("汽车结束行驶......行驶时间："+ (end-begin)+" 毫秒");
        return null;
    }
}
