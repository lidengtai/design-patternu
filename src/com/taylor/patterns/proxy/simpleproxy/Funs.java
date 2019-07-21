package com.taylor.patterns.proxy.simpleproxy;

/**
 * @ClassName Funs
 * @Description 简单的静态代理
 * @Author lidengtai
 * @Date 2019/5/30 14:17
 * @Version 1.0
 */
public class Funs {

    public static void main(String[] args) {
        Star star = new ProxyStarImpl();
        star.seal();
    }
}
