package com.taylor.patterns.observer;

/**
 * @ClassName Observer
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/31 11:03
 * @Version 1.0
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
