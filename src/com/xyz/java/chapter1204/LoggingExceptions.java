package com.xyz.java.chapter1204;

/**
 * Created by windview on 11/27/14.
 */
public class LoggingExceptions {

    public static void main(String[] args) {
        try {
            throw new LogginException();
        }catch (LogginException e) {
            System.err.println("Caught" + e);
        }

        try {
            throw new LogginException();
        }catch (LogginException e) {
            System.err.println("Caught" + e);
        }
    }
}
