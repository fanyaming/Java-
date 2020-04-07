package com.fym.thread;

/**
 * Created by lenovo on 2020/3/30.
 */
public class RunnableTest implements Runnable {
    private int i ;
    @Override
    public void run() {
        for(;i<50;i++){
            System.out.println(Thread.currentThread().getName() + " -- " + i);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i==20){
                RunnableTest runnableTest = new RunnableTest() ;
                new Thread(runnableTest,"线程1").start() ;
            }
            System.out.println(Thread.currentThread().getName() + " is running " + i);
        }
    }
}
