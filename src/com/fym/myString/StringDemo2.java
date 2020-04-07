package com.fym.myString;

/**
 * Created by lenovo on 2020/3/26.
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //把单词首字母大写
        String str = "adasfagfadf";
        //1.截取到首字母并转换为大写
        String s = str.substring(0, 1).toUpperCase();
        //2.截取后面的所有字母
        String s1 = str.substring(1);
        String s2=s+s1;
        System.out.println(s2);
    }
}
