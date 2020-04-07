package com.fym.synchronizeds;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lenovo on 2020/3/31.
 */
class Apple2 implements Runnable {
    private int num = 100;
    private final Lock lock = new ReentrantLock();//创建一个锁对象

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            eat();
        }
    }

    private void eat() {
        //进入方法进加锁
        lock.lock();
        try {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "吃了第" + num + "个苹果");
                Thread.sleep(100);
            }
            num--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//释放锁
        }
    }

}

public class LockDemo {
    public static void main(String[] args) {
        Apple2 apple = new Apple2();
        new Thread(apple, "A").start();
        new Thread(apple, "B").start();
        new Thread(apple, "C").start();
    }
}
