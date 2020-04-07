package com.fym.thread;

/**
 * Created by lenovo on 2020/3/31.
 */
class join extends Thread{
    @Override
    public void run() {
        for(int i =0;i<50;i++){
            System.out.println("join"+i);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        join join = new join();
        for(int i =0;i<50;i++){
            if(i==10){
                join.start();
            }
            if(i==20){
                join.join();
            }
            System.out.println("com/fym/main" +i);
        }
    }
}

