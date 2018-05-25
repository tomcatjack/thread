package com.wei.thread.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记【不推荐】的类或者写法
 *   @Target(ElementType.TYPE) ----> 作用在类上
 *  @Retention(RetentionPolicy.SOURCE)  作用的范围
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {

    String value() default "";
}
