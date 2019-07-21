package com.taylor.patterns.factory.firstdemo.color;

import com.taylor.patterns.factory.firstdemo.AbstractFactory;
import com.taylor.patterns.factory.firstdemo.shape.Shape;

/**
 * @ClassName ColorFactory
 * @Description 生产各种颜色工厂类
 * @Author lidengtai
 * @Date 2019/5/29 14:06
 * @Version 1.0
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    /**
     *
     * @param color
     * @return
     */
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
