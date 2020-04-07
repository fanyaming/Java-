package com.fym.myString;

/**
 * Created by lenovo on 2020/3/26.
 */
public class StringDemo {
    private static String getXx() {
        return "AB";
    }
    public static void main(String[] args) {
    // 说说下面String对象,彼此之间是否相等.
        String str1 = "ABCD";
        String str2 = "A" + "B" + "C" + "D";
        String str3 = "AB" + "CD";
        String str4 = new String("ABCD");
        String temp = "AB";
        String str5 = temp + "CD";
        String str6 = getXx() + "CD";
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//true
        System.out.println(str1==str4);//false
        System.out.println(str1==str5);//false
        System.out.println(str1==str6);//false
    }
}
