package com.xyz.java.chapter1204;

/**
 * Created by windview on 11/27/14.
 */
public class MyException2 extends Exception {

    private int x;

    public MyException2() {
    }

    // 可以为异常类定义一个接受字符串参数 的构造器
    public MyException2(String message) {
        super(message);
    }


    public MyException2(String message, int x) {
        super(message);
        this.x = x;
    }

    public int val(){return x;}

    public String getMessage() {
        return "Detail Message:" + x + " " + super.getMessage();
    }
}
