/*
package com.fym.myDate;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

*/
/**
 * Created by lenovo on 2020/4/6.
 *//*

public class DateUtils {

    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    */
/***
     * Date类型转换成XMLGregorianCalendar类型
     *
     * @param date
     * @return
     *//*

    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
            logger.error("Date类型转换成XMLGregorianCalendar类型出错：" + e);
        }
        return gc;
    }

    */
/***
     * XMLGregorianCalendar类型转换成Date类型
     *
     * @param cal
     * @return
     * @throws Exception
     *//*

    public static Date convertToDate(XMLGregorianCalendar cal) throws Exception {
        GregorianCalendar ca = cal.toGregorianCalendar();
        return ca.getTime();
    }

    */
/**
     * String 转 Date
     *
     * @param str    日期字符串
     * @param format 转换格式
     * @return Date
     *//*

    public static Date stringToDate(String str, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = dateFormat.parse(str);
        } catch (ParseException e) {
            logger.error("String类型 转 Date类型出错：" + e);
        }
        return date;
    }

    */
/**
     * Date 转 String
     * auther: shijing
     * 2015年3月25日上午11:28:14
     *
     * @param date   日期
     * @param format 转换格式
     * @return
     *//*

    public static String dateToString(Date date, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        String strDate = null;
        try {
            if (date != null) {
                strDate = dateFormat.format(date);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            logger.error("Date类型 转 String类型出错：" + e);
        }
        return strDate;
    }


    */
/***
     * 测试方法
     *
     * @param args
     *//*

    public static void com.fym.main(String[] args) {
        XMLGregorianCalendar d = DateUtils
                .convertToXMLGregorianCalendar(new Date());
//		System.out.println(d.getDay());
        XMLGregorianCalendar cal = null;
        try {
            cal = DatatypeFactory.newInstance().newXMLGregorianCalendar();
            cal.setMonth(06);
            cal.setYear(2010);
            Date date = DateUtils.convertToDate(cal);
            String format = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat formatter = new SimpleDateFormat(format);
//			System.out.println(formatter.format(date));

            Date d1 = DateUtils.stringToDate("2014/7/24 9:51:00", "yyyy/MM/dd hh:mm:ss");
            XMLGregorianCalendar d2 = DateUtils.convertToXMLGregorianCalendar(d1);
//			System.out.println(d2.toString());

            String dateStr = DateUtils.dateToString(cal.toGregorianCalendar().getTime(), "yyyy-MM-dd HH:mm:ss");
//			System.out.println("dateStr="+ dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/
