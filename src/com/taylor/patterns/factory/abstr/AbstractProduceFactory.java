package com.taylor.patterns.factory.abstr;

/**
 * @ClassName AbstractProduceFactory
 * @Description 抽象工厂
 * @Author lidengtai
 * @Date 2019/5/30 10:02
 * @Version 1.0
 */
public interface AbstractProduceFactory {

    Monitor produceMonitor();
    Phone producePhone();
}
