package com.taylor.patterns.factory.method;

/**
 * @ClassName ChickenFactory
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 9:26
 * @Version 1.0
 */
public class ChickenFactory implements FoodFactory {
    @Override
    public Food produceFood() {
        return new Chicken();
    }
}
