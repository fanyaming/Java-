package com.fym.thread;

/**
 * Created by lenovo on 2020/3/30.
 */
public class ThreadTest extends Thread {
    private int i = 0;

    @Override
    public void run() {
        for (; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
        }
    }

    public static void main(String[] args) {
        for (int j = 0; j < 50; j++) {
            if (j == 20) {
                new ThreadTest().start();
            }
            System.out.println(Thread.currentThread().getName() + " is running " + j);
        }
    }
}
