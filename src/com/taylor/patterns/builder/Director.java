package com.taylor.patterns.builder;

/**
 * @ClassName Director
 * @Description 建造者
 * @Author lidengtai
 * @Date 2019/5/30 13:43
 * @Version 1.0
 */
public class Director {

    public static Computer constructorComputer(Builder builder){
        builder.buildCpu();
        builder.buildHardDisk();
        builder.buildMainBoard();
        return builder.buildComputer();
    }

}
