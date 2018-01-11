package com.example.lhy.testsingleinstance;

/**
 * Created by lhy on 2018/1/11.
 * 懒汉模式--线程安全
 */

public class LazyAsynSingleInstance {
    private static LazyAsynSingleInstance instance;

    private LazyAsynSingleInstance() {

    }

    private static synchronized LazyAsynSingleInstance getInstance() {
        if (instance == null) {
            instance = new LazyAsynSingleInstance();
        }
        return instance;
    }
}
