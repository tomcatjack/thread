package com.wei.thread.callableandfuture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuturec {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add(i);
        }
        ExecutorService threadPool = Executors.newFixedThreadPool  (20);
        List<Future> tasks = new ArrayList<>();
        list.forEach(l ->{
            tasks.add(threadPool.submit(new Callable<Object>() {
                public String call() throws Exception {
                    return Thread.currentThread().getName()+">>>"+new Random().nextInt(100);
                }
            }));
        });
        tasks.forEach(future -> {
            try {

                System.out.println(future.get());
            } catch (Exception e) {
                future.cancel(true);
            }
        });
    }
}
