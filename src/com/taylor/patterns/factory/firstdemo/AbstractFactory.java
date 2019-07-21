package com.taylor.patterns.factory.firstdemo;

import com.taylor.patterns.factory.firstdemo.color.Color;
import com.taylor.patterns.factory.firstdemo.shape.Shape;

/**
 * @ClassName AbstractFactory
 * @Description 为 Color 和 Shape 对象创建抽象类来获取工厂
 * @Author lidengtai
 * @Date 2019/5/29 14:00
 * @Version 1.0
 */
public abstract class  AbstractFactory {

    /**
     *
     * @param shapeType
     * @return
     */
    public abstract Shape getShape(String shapeType);

    /**
     *
     * @param colorType
     * @return
     */
    public abstract Color getColor(String colorType);
}
