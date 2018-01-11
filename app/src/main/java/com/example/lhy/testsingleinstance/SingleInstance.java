package com.example.lhy.testsingleinstance;

/**
 * Created by lhy on 2018/1/11.
 * 饿汉式单例模式
 */

public class SingleInstance {
    private static SingleInstance instance = new SingleInstance();

    private SingleInstance() {

    }

    public static SingleInstance getInstance() {
        return instance;
    }
}
