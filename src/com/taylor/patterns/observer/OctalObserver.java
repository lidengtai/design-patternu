package com.taylor.patterns.observer;

/**
 * @ClassName OctalObserver
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/31 11:12
 * @Version 1.0
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        //十进制转换八进制
        System.out.println("Octal String: "  + Integer.toOctalString(subject.getState()));
    }
}
