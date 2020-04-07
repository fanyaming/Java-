package com.fym.main.iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by lenovo on 2020/4/3.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //方式一:使用for循环
        for (int index=0;index<list.size();index++){
            Object ele = list.get(index);
            System.out.println(ele);
        }
        //方式二:使用foreach循环
        for (Object ele : list) {
            System.out.println(ele);
        }
        //方式三:使用while操作iterator迭代器
        Iterator<Object> it = list.iterator();//得到迭代器对象
        while (it.hasNext()){
            Object ele = it.next();
            System.out.println(ele);
        }
        //方式四:使用for循环来操作迭代器
        for(Iterator<Object> it1 = list.iterator();it1.hasNext();){
            Object ele = it1.next();
            System.out.println(ele);
        }
        //方式五:使用古老的迭代器Enumeration(操作vector),现在基本不使用
        Vector<Object> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        Enumeration<Object> e = v.elements();
        while (e.hasMoreElements()){
            Object ele = e.nextElement();
            System.out.println(ele);
        }
    }
}
