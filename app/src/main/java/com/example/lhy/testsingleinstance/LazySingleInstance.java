package com.example.lhy.testsingleinstance;

/**
 * Created by lhy on 2018/1/11.
 * 懒汉式单利模式--线程不安全
 */

public class LazySingleInstance {
    private static LazySingleInstance instance;

    private LazySingleInstance() {

    }

    public static LazySingleInstance getInstance() {
        if (instance == null) {
            instance = new LazySingleInstance();
        }
        return instance;
    }
}
