package com.wei.thread.callableandfuture;

import java.util.concurrent.Callable;

public class PushProcess implements Callable<String> {

    private Integer i;

    public PushProcess(Integer i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        if(i%2==0){
            return Thread.currentThread().getName()+">>>>"+i;
        }else{
            return Thread.currentThread().getName()+">>>>"+1000;
        }
    }
}

