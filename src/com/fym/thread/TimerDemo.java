package com.fym.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lenovo on 2020/3/31.
 */
public class TimerDemo {
    public static void main(String[] args) {
        System.out.println("begin....");
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date().toLocaleString());
            }
        },3000,1000);
    }
}
