package com.fym.myDate;

import java.util.Date;

/**
 * Created by lenovo on 2020/3/26.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//Mon Mar 30 18:13:26 CST 2020
        // 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
        System.out.println(date.getTime());//1585563307686
        //过时方法,但是可以使用
        System.out.println(date.toLocaleString());//2020-3-30 18:14:13
    }
}
