package com.taylor.patterns.builder;

/**
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 13:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = Director.constructorComputer(new BuilderComputer());
        System.out.println(computer.toString());
    }
}
