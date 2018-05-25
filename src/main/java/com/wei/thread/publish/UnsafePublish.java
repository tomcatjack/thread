package com.wei.thread.publish;

import com.wei.thread.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 发布对象:使一个对象能够被当前范围之外的代码所使用
 */
@Slf4j
@NotThreadSafe
public class UnsafePublish {

    private String[] states = {"a", "b", "c"};

    public String[] getStates() {
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();    // 这样发布对象是不安全的
        log.info("{}", Arrays.toString(unsafePublish.getStates()));

        unsafePublish.getStates()[0] = "d";  //可对私有变量的修改
        log.info("{}", Arrays.toString(unsafePublish.getStates()));
    }
}
