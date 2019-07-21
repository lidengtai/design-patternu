package com.taylor.patterns.observer;

/**
 * @ClassName ObserverPatternDemo
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/31 11:15
 * @Version 1.0
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
