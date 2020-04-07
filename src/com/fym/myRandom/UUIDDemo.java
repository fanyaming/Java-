package com.fym.myRandom;

/**
 * Created by lenovo on 2020/3/26.
 */
public class UUIDDemo {
    public static void main(String[] args) {
        int r1=(int)(Math.random()*(10));//产生2个0-9的随机数
        int r2=(int)(Math.random()*(10));
        long now = System.currentTimeMillis();//一个13位的时间戳
        String paymentID0 =String.valueOf(r1)+String.valueOf(r2)+String.valueOf(now);
        int r3=(int)(Math.random()*(10));//产生2个0-9的随机数
        int r4=(int)(Math.random()*(10));
        String paymentID = paymentID0 +String.valueOf(r3)+String.valueOf(r4);// 订单ID

    }
}
