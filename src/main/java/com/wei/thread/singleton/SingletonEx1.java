package com.wei.thread.singleton;

import com.wei.thread.annoations.NotThreadSafe;

/**
 * 单利模式(懒汉模式)
 *
 * 单利实例在第一次使用时进行创建
 * 如果时多线程可能时有问题的
 */
@NotThreadSafe
public class SingletonEx1 {

    //私有构造方法
    private SingletonEx1(){

    }

    //单利对象
    private static SingletonEx1 instance = null;

    //静态的工厂
    private static SingletonEx1 getInstance(){
        if(instance == null){
            instance = new SingletonEx1();
        }
        return instance;
    }
}
