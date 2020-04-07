package com.fym.math;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Created by lenovo on 2020/3/30.
 */
public class BigdecimalDemo {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //建立货币格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用
        percent.setMaximumFractionDigits(3); //百分比小数点最多3位

        BigDecimal loanAmount = new BigDecimal("15000.48"); //贷款金额
        BigDecimal interestRate = new BigDecimal("0.008"); //利率
        BigDecimal interest = loanAmount.multiply(interestRate); //相乘

        System.out.println("贷款金额:\t" + currency.format(loanAmount));//贷款金额:	￥15,000.48
        System.out.println("利率:\t" + percent.format(interestRate));//利率:	0.8%
        System.out.println("利息:\t" + currency.format(interest));//利息:	￥120.00
    }
}
