package com.xyz.java.chapter1210;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by windview on 12/1/14.
 */
public class InputFile {

    private BufferedReader in;

    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));

            // 如果FileReader构造器失败了，将抛出FileNotFoundException异常,对于这个异常并不需要关闭文件
            // 因为这个文件还没有被打开，而任何其他捕获异常的catch字句必须关闭文件
        } catch (FileNotFoundException e) {
            System.out.println("Could not open" + fname);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        } finally {
            // Don't close it here!
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        }catch (Exception e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
