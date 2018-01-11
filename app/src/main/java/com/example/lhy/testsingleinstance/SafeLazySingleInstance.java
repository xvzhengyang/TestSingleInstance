package com.example.lhy.testsingleinstance;

/**
 * Created by lhy on 2018/1/11.
 * 安全的懒汉式
 */

public class SafeLazySingleInstance {
    private static SafeLazySingleInstance instance;
    private SafeLazySingleInstance(){

    }
    public static synchronized SafeLazySingleInstance getInstance(){
        if (instance==null){
            instance = new SafeLazySingleInstance();
        }
        return instance;
    }
}
