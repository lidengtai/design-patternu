package com.taylor.patterns.factory.abstr;

/**
 * @ClassName MiPhone
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 10:00
 * @Version 1.0
 */
public class MiPhone implements Phone {
    @Override
    public void openPhone() {
        System.out.println("小米手机启动");
    }
}
