package com.taylor.patterns.proxy.simpleproxy;

/**
 * @ClassName ProxyStarImpl
 * @Description 经纪人代理
 * @Author lidengtai
 * @Date 2019/5/30 14:17
 * @Version 1.0
 */
public class ProxyStarImpl implements Star {
    @Override
    public void seal() {
        new StarImpl().seal();
    }
}
