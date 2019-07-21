package com.taylor.patterns.factory.firstdemo.shape;

import com.taylor.patterns.factory.firstdemo.AbstractFactory;
import com.taylor.patterns.factory.firstdemo.color.Color;

/**
 * @ClassName ShapeFactory
 * @Description 生产各种形状的工厂类
 * @Author lidengtai
 * @Date 2019/5/29 11:50
 * @Version 1.0
 */
public class ShapeFactory  extends AbstractFactory {

    /**
     * 根据不同的形状的类型获取具体的形状对象
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else {
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
