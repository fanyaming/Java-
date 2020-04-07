package com.fym.myDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lenovo on 2020/3/30.
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String pattern="yyyy-MM-dd";//指定风格
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern(pattern);//将给定模式字符串应用于此日期格式
        String format = sdf.format(date);
        System.out.println(format);//2020-03-30
        Date date1 = sdf.parse(format);
        System.out.println(date1);//Mon Mar 30 00:00:00 CST 2020
    }
}
