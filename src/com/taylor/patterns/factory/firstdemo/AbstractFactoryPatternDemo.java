package com.taylor.patterns.factory.firstdemo;

import com.taylor.patterns.factory.firstdemo.color.Color;
import com.taylor.patterns.factory.firstdemo.shape.Shape;

/**
 * @ClassName AbstractFactoryPatternDemo
 * @Description 抽象工厂模式
 * @Author lidengtai
 * @Date 2019/5/29 14:08
 * @Version 1.0
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("green");
        color.fill();




    }
}
