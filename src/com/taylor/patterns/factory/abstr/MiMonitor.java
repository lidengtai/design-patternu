package com.taylor.patterns.factory.abstr;

/**
 * @ClassName MiMonitor
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 9:58
 * @Version 1.0
 */
public class MiMonitor implements Monitor {
    @Override
    public void openMonitor() {
        System.out.println("小米显示器启动");
    }
}
