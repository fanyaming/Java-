package com.fym.myDate;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by lenovo on 2020/3/30.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        // 需求：查询最近一周。。。的信息，如何表示最近这一周
        Date current = new Date();
        Date endTime = null;
        Calendar c = Calendar.getInstance();
        int month=c.get(Calendar.MONTH)+1;
        c.setTime(current);
        //把日增加一天，时分秒设置为0
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, 0);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        endTime = c.getTime();
        c.add(Calendar.DAY_OF_MONTH, -7);
        Date beginTime = c.getTime();
        System.out.println("开始时间："+beginTime.toLocaleString());//开始时间：2020-3-24 0:00:00
        System.out.println("结束时间："+endTime.toLocaleString());//结束时间：2020-3-31 0:00:00
    }
}
