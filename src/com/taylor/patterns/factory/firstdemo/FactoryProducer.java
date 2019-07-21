package com.taylor.patterns.factory.firstdemo;

import com.taylor.patterns.factory.firstdemo.color.ColorFactory;
import com.taylor.patterns.factory.firstdemo.shape.ShapeFactory;

/**
 * @ClassName FactoryProducer
 * @Description 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @Author lidengtai
 * @Date 2019/5/29 14:11
 * @Version 1.0
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }else {
            return null;
        }

    }

}
