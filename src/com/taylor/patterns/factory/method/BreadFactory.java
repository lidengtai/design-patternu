package com.taylor.patterns.factory.method;

/**
 * @ClassName BreadFactory
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 9:26
 * @Version 1.0
 */
public class BreadFactory implements FoodFactory {
    @Override
    public Food produceFood() {
        return new Bread();
    }
}
