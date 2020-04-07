package com.fym.myRandom;

import java.util.Random;

/**
 * Created by lenovo on 2020/3/26.
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random =new Random();
        int num = random.nextInt(100);
        System.out.println(num);
    }
}
