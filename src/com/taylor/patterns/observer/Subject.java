package com.taylor.patterns.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName Subject
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/31 10:55
 * @Version 1.0
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
