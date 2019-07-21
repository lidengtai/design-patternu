package com.taylor.patterns.factory.abstr;

/**
 * @ClassName LenovoPhone
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 9:59
 * @Version 1.0
 */
public class LenovoPhone implements Phone {
    @Override
    public void openPhone() {
        System.out.println("联想手机启动");
    }
}
