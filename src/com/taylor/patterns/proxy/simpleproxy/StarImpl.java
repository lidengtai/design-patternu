package com.taylor.patterns.proxy.simpleproxy;

/**
 * @ClassName StarImpl
 * @Description TODO
 * @Author lidengtai
 * @Date 2019/5/30 14:16
 * @Version 1.0
 */
public class StarImpl implements Star {
    @Override
    public void seal() {
        System.out.println("范冰冰的亲笔签名");
    }
}
