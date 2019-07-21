package com.taylor.patterns.builder;

/**
 * @ClassName Builder
 * @Description 构建者接口
 * @Author lidengtai
 * @Date 2019/5/30 13:33
 * @Version 1.0
 */
public interface Builder {

    //构建主板
    void buildMainBoard();

    //构建cpu
    void buildCpu();

    //构建硬盘
    void buildHardDisk();

    //构建电脑
    Computer buildComputer();
}
