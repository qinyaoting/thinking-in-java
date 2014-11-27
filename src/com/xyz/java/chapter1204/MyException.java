package com.xyz.java.chapter1204;

/**
 * Created by windview on 11/27/14.
 */
public class MyException extends Exception {

    public MyException() {
    }

    // 可以为异常类定义一个接受字符串参数 的构造器
    public MyException(String message) {
        super(message);
    }
}
