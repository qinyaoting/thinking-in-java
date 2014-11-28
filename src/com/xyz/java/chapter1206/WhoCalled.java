package com.xyz.java.chapter1206;

/**
 * Created by windview on 11/28/14.
 */
public class WhoCalled {


    // 12.6.1 栈轨迹
    // printStackTrace()所提供的信息可以通过getStackTrace()来直接访问，这个方法返回一个由栈轨迹
    // 中的元素所构成的数组，其中每个元素都表示栈中的一帧
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }


        static void g() {f();}

        static void h() {g();}

    public static void main(String[] args) {
        f();
        System.out.println("--------------");
        g();
        System.out.println("--------------");
        h();
    }
}
