package com.fym.myString;

/**
 * Created by lenovo on 2020/3/26.
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //获取以hello开头的文件名的的后缀名
        String fileNames = "abc.java;hello.txt;hello.java;hello.class";
        //1.将字符串以分号分隔开
        String[] names = fileNames.split(";");
        for (String name : names) {
            //2.得到所有以hello开头的字符串
            if(name.startsWith("hello")){
                //3.返回指定子字符串在此字符串中最右边出现处的索引
                int i = name.lastIndexOf(".");
                //4.根据索引来截取后缀名
                String newName = name.substring(i);
                System.out.println(newName);
            }
        }
    }
}
