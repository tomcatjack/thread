package com.wei.thread.runabletest;

public class RunaleTest implements Runnable{

    private String threadName;

    public RunaleTest(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i = 0 ; i<100 ;i++){
            System.out.println("TreadName:"+threadName+">>>>>"+i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public static void main(String[] args) {
        Thread C = new Thread(new RunaleTest("C"));
        Thread D = new Thread(new RunaleTest("D"));
        C.start();
        D.start();
    }
}
