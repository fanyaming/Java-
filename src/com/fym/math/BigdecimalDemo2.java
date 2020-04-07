package com.fym.math;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by lenovo on 2020/3/30.
 */
public class BigdecimalDemo2 {
    public static void main(String[] s){
        System.out.println(formatToNumber(new BigDecimal("3.435")));//3.44
        System.out.println(formatToNumber(new BigDecimal(0)));//0.00
        System.out.println(formatToNumber(new BigDecimal("0.00")));//0.00
        System.out.println(formatToNumber(new BigDecimal("0.001")));//0.00
        System.out.println(formatToNumber(new BigDecimal("0.006")));//0.00
        System.out.println(formatToNumber(new BigDecimal("0.206")));//0.21
    }
    /**
     * @desc 1.0~1之间的BigDecimal小数，格式化后失去前面的0,则前面直接加上0。
     * 2.传入的参数等于0，则直接返回字符串"0.00"
     * 3.大于1的小数，直接格式化返回字符串
     * @param
     * @return
     */
    public static String formatToNumber(BigDecimal obj) {
        DecimalFormat df = new DecimalFormat("#.00");
        if(obj.compareTo(BigDecimal.ZERO)==0) {
            return "0.00";
        }else if(obj.compareTo(BigDecimal.ZERO)>0&&obj.compareTo(new BigDecimal(1))<0){
            return "0"+df.format(obj).toString();
        }else {
            return df.format(obj).toString();
        }
    }
}
