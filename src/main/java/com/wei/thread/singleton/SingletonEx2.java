package com.wei.thread.singleton;

import com.wei.thread.annoations.ThreadSafe;

/**
 * 单利模式(饿汉模式)
 *
 * 类装载的时候进行创建
 *
 * 如果构造函数中有过多的处理 可能会引起性能问题
 */
@ThreadSafe
public class SingletonEx2 {

    //私有构造方法
    private SingletonEx2(){

    }

    //单利对象
    private static SingletonEx2 instance = new SingletonEx2();

    //静态的工厂
    private static SingletonEx2 getInstance(){
        return instance;
    }
}
