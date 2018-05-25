package com.wei.thread.final_;

/**
 * Java中的基本类型和引用类型变量的区别
 *
 * 在给value1赋初始值之后，我们无法再对value1的值进行修改，final关键字起到了常量的作用。
 *
 * 从value2我们可以看到，final修饰的变量可以不在声明时赋值，即可以先声明，后赋值。
 *
 * value3时一个引用变量，这里我们可以看到final修饰引用变量时，只是限定了引用变量的引用不可改变，即不能将value3再次引用另一个Value对象，但是引用的对象的值是可以改变的
 *
 *
 *
 *              final修饰
 *               (不可变)
 *
 *  value3     只存地址地址      》》》》指向》》》  value
 *                                                1
 *
 *  value2       2.0
 *
 *  value1        1
 *
 *             main方法栈                         堆
 */

public class Example01 {

        final int f1 = 1;
        final int f2;
        public Example01() {
            f2 = 2;
        }

        public static void main(String[] args) {
            final int value1 = 1;
            // value1 = 4;
            final double value2;
            value2 = 2.0;
            final Value value3 = new Value(1);
            value3.v = 4;
        }

}
