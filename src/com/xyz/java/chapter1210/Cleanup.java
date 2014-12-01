package com.xyz.java.chapter1210;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 * Created by windview on 12/1/14.
 */
public class Cleanup {

    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");
            try {
                String s;
                int i=1;
                while ((s=in.getLine()) != null)
                    ;//
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e){
            System.out.println();
        }
    }

    //如果InputFile构造器失败会进入外部的catch，dispose()不会被调用
    //如果构造器成功，肯定对想能够被清理

    // 在创建需要清理的对象之后，立即进入try-finally语句块

}
