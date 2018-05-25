package com.wei.thread.publish;

import com.wei.thread.annoations.NotRecommend;
import com.wei.thread.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * 对象的溢出：一种错误的发布，当一个对象还没有构造完成时，就使它被其他线程所见
 */
@Slf4j
@NotThreadSafe
@NotRecommend
public class Escape {

    private int thisCanBeEscape = 0;

    public Escape () {
        new InnerClass();
    }

    private class InnerClass {

        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
