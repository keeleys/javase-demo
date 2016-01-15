package com.ttianjun.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @user keeley
 * @date 16/1/15
 */
public class IODemo {
    public static void main(String[] args) {
        final String fileName = "/Users/keeley/onedrive/机器.txt";

        //java7 新特点,try后面跟大括号,括号里面的文件流等都可以自动释放不需要手动close了
        try (
                BufferedReader br = new BufferedReader(new FileReader(fileName))
        ){
            String str;
            do {
                str = br.readLine();
                System.out.println(str);
            }while (str!=null);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
