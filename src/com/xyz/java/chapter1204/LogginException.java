package com.xyz.java.chapter1204;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by windview on 11/27/14.
 */
public class LogginException extends Exception {


    private static Logger logger =
            Logger.getLogger("LogginException");

    public LogginException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());

    }
}
