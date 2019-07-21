package com.taylor.patterns.builder;

/**
 * @ClassName BuilderComputer
 * @Description 具体的构建者
 * @Author lidengtai
 * @Date 2019/5/30 13:39
 * @Version 1.0
 */
public class BuilderComputer implements Builder {

    private Computer computer = new Computer();
    @Override
    public void buildMainBoard() {
        computer.setMainBoard("华硕");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("英特尔");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("希捷");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
