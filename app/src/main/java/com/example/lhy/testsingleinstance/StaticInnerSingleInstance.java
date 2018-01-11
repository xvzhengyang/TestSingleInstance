package com.example.lhy.testsingleinstance;

/**
 * Created by lhy on 2018/1/11.
 * 静态内部类的单例模式
 * 第一次加载类并不会初始化instance;只有第一次调用getInstance（）方法时候虚拟机加载StatciInnerSingleInstance;
 */

public class StaticInnerSingleInstance {
    private StaticInnerSingleInstance() {

    }

    public static StaticInnerSingleInstance getInstance() {
        return SingleHolder.instance;
    }

    private static class SingleHolder {
        private static final StaticInnerSingleInstance instance = new StaticInnerSingleInstance();
    }
}
