package com.taylor.patterns.builder;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 13:28
 * @Version 1.0
 */
public class Computer {
    private String mainBoard;
    private String cpu;
    private String hardDisk;

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mainBoard='" + mainBoard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }
}
