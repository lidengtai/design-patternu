package com.taylor.patterns.factory.method;

/**
 * @ClassName TestFactory
 * @Description
 * @Author lidengtai
 * @Date 2019/5/30 9:27
 * @Version 1.0
 */
public class TestFactory {
    public static void main(String[] args) {

        FoodFactory food = new ChickenFactory();
        food.produceFood().food();

        food = new RiceFactory();
        food.produceFood().food();

        food = new PigFactory();
        food.produceFood().food();
    }
}
