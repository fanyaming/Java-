package com.fym.main.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lenovo on 2020/4/3.
 */
public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        /*for (Object ele : com.fym.list) {
            if("C".equals(ele)){
                com.fym.list.remove(ele);//ConcurrentModificationException并发修改异常
            }
            System.out.println(ele);
        }*/
        //使用迭代器的删除方法
        Iterator<Object> it = list.iterator();
        while (it.hasNext()){
            if("C".equals(it.next())){
                it.remove();
            }
        }
        System.out.println(list);//[A, B]
    }
}
