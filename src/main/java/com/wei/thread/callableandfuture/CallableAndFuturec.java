package com.wei.thread.callableandfuture;

import java.util.ArrayList;
import java.util.List;
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
        list.forEach( l ->{
            PushProcess pushProcess = new PushProcess(l);
            tasks.add( threadPool.submit(pushProcess));
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
