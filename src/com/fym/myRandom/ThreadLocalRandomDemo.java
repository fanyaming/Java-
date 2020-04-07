package com.fym.myRandom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by lenovo on 2020/3/26.
 */
public class ThreadLocalRandomDemo {
    public static void main(String[] args) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int num = threadLocalRandom.nextInt(10, 100);
        System.out.println(num);
    }
}
