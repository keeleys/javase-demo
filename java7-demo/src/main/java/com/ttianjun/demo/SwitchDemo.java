package com.ttianjun.demo;

/**
 * @user keeley
 * @date 16/1/15
 */
public class SwitchDemo {


    public static void main(String[] args) {

        //java6
        int flag =5;
        switch (flag){
            case 5:
                System.out.println("is num "+5);break;
            default:;
        }

        //java7
        String status ="5";

        switch (status){
            case "1":;break;
            case "5":
                System.out.println("is str 5");break;
            default:;
        }
    }
}
