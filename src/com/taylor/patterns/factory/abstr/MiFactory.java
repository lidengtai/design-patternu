package com.taylor.patterns.factory.abstr;

/**
 * @ClassName MiFactory
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 10:13
 * @Version 1.0
 */
public class MiFactory implements AbstractProduceFactory {
    @Override
    public Monitor produceMonitor() {
        return new MiMonitor();
    }

    @Override
    public Phone producePhone() {
        return new MiPhone();
    }
}
