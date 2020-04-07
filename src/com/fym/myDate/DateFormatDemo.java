package com.fym.myDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by lenovo on 2020/3/30.
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        DateFormat df = DateFormat.getInstance();
        String format = df.format(date);
        System.out.println(format);//20-3-30 下午6:22默认的是短风格的日期格式
        Date date1 = df.parse(format);
        System.out.println(date1);//Mon Mar 30 18:29:00 CST 2020
        df = DateFormat.getDateInstance(DateFormat.LONG);
        String format1 = df.format(date);
        System.out.println(format1);//2020年3月30日.选择风格
        df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String format2 = df.format(date);
        System.out.println(format2);//2020年3月30日 下午06时26分07秒
    }
}
