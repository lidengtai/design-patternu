package com.taylor.patterns.factory.abstr;

/**
 * @ClassName lenovoMonitor
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 9:57
 * @Version 1.0
 */
public class LenovoMonitor implements Monitor {
    @Override
    public void openMonitor() {
        System.out.println("联想显示器启动");
    }
}
