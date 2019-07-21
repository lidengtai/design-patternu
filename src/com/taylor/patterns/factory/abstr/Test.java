package com.taylor.patterns.factory.abstr;

/**
 * @ClassName
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 10:13
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
            AbstractProduceFactory factory = new LenovoFactory();
            factory.produceMonitor().openMonitor();
            factory.producePhone().openPhone();

            factory = new MiFactory();
            factory.producePhone().openPhone();
            factory.produceMonitor().openMonitor();
    }

}
