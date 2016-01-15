package com.ttianjun.demo;

import java.io.File;
import java.io.IOException;

/**
 * @user keeley
 * @date 16/1/15
 */
public class CatchDemo {

    public static void main(String[] args) {
        try {
            Class.forName("Test");
            File file  = File.createTempFile("","");
        }catch (IOException |ClassNotFoundException ie){
            // java7特性 同时处理多个异常
        }
    }
}
