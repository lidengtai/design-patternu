package com.taylor.patterns.observer;

/**
 * @ClassName HexaObserver
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/31 11:15
 * @Version 1.0
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        //十进制转换十六进制
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
