package com.wei.thread.threadtest;

/***
 * 程序启动运行main时候，java虚拟机启动一个进程，主线程main在main()调用时候被创建。
 * 随着调用MitiSay的两个对象的start方法，另外两个线程也启动了，这样，整个应用就在多线程下运行。
 *
 * start()方法的调用后并不是立即执行多线程代码，而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
 * 从程序运行的结果可以发现，多线程程序是乱序执行
 *
 * 实际上所有的多线程代码执行顺序都是不确定的，每次执行的结果都是随机的。
 */
public class ThreadTest extends Thread {

    private String threadName;

    public ThreadTest(String threadName) {
        this.threadName = threadName;
    }

    /**
     * 当 synchronized锁住这个类的时候  ，该类所有的对象同一把锁。
     */
//    public void run() {
//        synchronized (ThreadTest.class) {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("TreadName:" + threadName + ">>>>>" + i);
////            try {
////                Thread.sleep(500);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//            }
//        }
//    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("TreadName:" + threadName + ">>>>>" + i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }


    /**
     * 如果你调run方法  就是A先执行完  再取执行B
     * 调 start方法 就是A B 并发调
     *
     * @param args
     */
    public static void main(String[] args) {
        ThreadTest A = new ThreadTest("A");
        ThreadTest B = new ThreadTest("B");
        A.start();
        B.start();
//        A.run();
//        B.run();
    }
}
