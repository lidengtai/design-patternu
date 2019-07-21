package com.taylor.patterns.factory.method;

/**
 * @ClassName PigFactory
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 9:50
 * @Version 1.0
 */
public class PigFactory implements FoodFactory {
    @Override
    public Food produceFood() {
        return new Pig();
    }
}
