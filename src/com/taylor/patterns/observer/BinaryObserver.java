package com.taylor.patterns.observer;

/**
 * @ClassName BinaryObserver
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/31 11:05
 * @Version 1.0
 */
public class BinaryObserver extends Observer {


    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        //十进制转换二进制
        System.out.println("binary sting = " + Integer.toBinaryString(subject.getState()));
    }
}
