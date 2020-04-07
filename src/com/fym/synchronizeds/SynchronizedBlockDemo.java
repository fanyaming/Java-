package com.fym.synchronizeds;

/**
 * Created by lenovo on 2020/3/31.
 */
class Apple implements Runnable{
    private  int num=100;
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            synchronized (this) {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "吃了第" + num + "个苹果");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num--;
                }
            }
        }
    }
}
public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        Apple apple = new Apple();
        new Thread(apple, "A").start();
        new Thread(apple, "B").start();
        new Thread(apple, "C").start();
    }
}
