package com.wei.thread.singleton;

import com.wei.thread.annoations.NotThreadSafe;

/**
 * 懒汉模式 -》 双重同步锁单例模式
 * 单例实例在第一次使用时进行创建
 *
 * 这是线程不安全的   具体如下:
 *                          假设线程A执行到39行 线程B执行到36行 此时A正好执行第三部的操作 此时线程B判断到不为空 直接返回了instance 后续B拿instance去操作的时候就会出错
 */
@NotThreadSafe
public class SingletonExample4 {

    // 私有构造函数
    private SingletonExample4() {

    }
     //39行执行的顺序

    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    // JVM和cpu优化，发生了指令重排   改变后的顺序

    // 1、memory = allocate() 分配对象的内存空间
    // 3、instance = memory 设置instance指向刚分配的内存
    // 2、ctorInstance() 初始化对象

    // 单例对象
    private static SingletonExample4 instance = null;

    // 静态的工厂方法
    public static SingletonExample4 getInstance() {
        if (instance == null) { // 双重检测机制        // B
            synchronized (SingletonExample4.class) { // 同步锁
                if (instance == null) {
                    instance = new SingletonExample4(); // A - 3
                }
            }
        }
        return instance;
    }
}
