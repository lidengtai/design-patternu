package com.taylor.patterns.factory.method;

/**
 * @ClassName RiceFactory
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 9:25
 * @Version 1.0
 */
public class RiceFactory implements FoodFactory {
    @Override
    public Food produceFood() {
        return new Rice();
    }
}
