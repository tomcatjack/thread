package com.wei.thread.singleton;

import com.wei.thread.annoations.NotThreadSafe;
import com.wei.thread.annoations.ThreadSafe;

/**
 * 单利模式(懒汉模式)
 *
 * 单利实例在第一次使用时进行创建
 * 此时使用 synchronized 进行同步
 */
@ThreadSafe
public class SingletonEx3 {

    //私有构造方法
    private SingletonEx3(){

    }

    //单利对象
    private static SingletonEx3 instance = null;

    //静态的工厂
    private static synchronized SingletonEx3 getInstance(){
        if(instance == null){
            instance = new SingletonEx3();
        }
        return instance;
    }
}
