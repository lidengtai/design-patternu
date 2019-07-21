package com.taylor.patterns.factory.method;

/**
 * @ClassName Rice
 * @Description 大米
 * @Author lidengtai
 * @Date 2019/5/30 9:12
 * @Version 1.0
 */
public class Rice implements Food {
    @Override
    public void food() {
        System.out.println("生产了一碗米饭");
    }
}
