package com.example.lhy.testsingleinstance;

/**
 * Created by lhy on 2018/1/11.
 * 双重检测机制的单例模式
 */

public class DoubleSafeLazySingleInstance {
    /**
     * volatile保证了一个线程修改了某个变量的值，这个新值对其他线程来说是立即可见。
     */
    private static volatile DoubleSafeLazySingleInstance instance;

    private DoubleSafeLazySingleInstance() {

    }

    private static DoubleSafeLazySingleInstance getInstance() {
        if (instance == null) {
            synchronized (DoubleSafeLazySingleInstance.class) {
                if (instance == null) {
                    instance = new DoubleSafeLazySingleInstance();
                }
            }
        }
        return instance;
    }
}
