package com.xyz.java.chapter1207;

/**
 * Created by windview on 11/28/14.
 */
public class NeverCaught {

    // 12.7 Java标准异常
    // Throwable 这个Java类被用来表示任何可以作为异常被抛出的类。分为两种类型
        // Error 编译时和系统错误
        // Exception是可以被抛出的基本类型

    // 12.7.1 特例RuntimeException
    //if (t == null)
    //    throw new NullPointerException();
    //如果对传递给方法的每个引用都检查是否为null，着实吓人，这不必亲自来做，他属于java的标准运行时检测的一部分

    //这些异常很多，都是从RuntimeException类继承来，并且不再需要在异常说明中声明方法将抛出RuntimeException
    // 任何从RuntimeException继承来异常都被称为不受检查异常，这中异常属于错误，将被自动捕获，不必亲自动手

    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }

    // 只能在代码中忽略RuntimeException类型的异常，其他异常的处理都算有编译器强制实施的
    // RuntimeExcetpion代表的所编程错误



}
