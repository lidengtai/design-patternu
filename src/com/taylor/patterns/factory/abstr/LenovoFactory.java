package com.taylor.patterns.factory.abstr;

/**
 * @ClassName LenovoFactory
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 10:06
 * @Version 1.0
 */
public class LenovoFactory implements AbstractProduceFactory {
    @Override
    public Monitor produceMonitor() {
        return new LenovoMonitor();
    }

    @Override
    public Phone producePhone() {
        return new LenovoPhone();
    }
}
