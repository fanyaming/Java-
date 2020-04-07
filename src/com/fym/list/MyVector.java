package com.fym.list;

import java.util.Vector;

/**
 * Created by lenovo on 2020/4/1.
 */
public class MyVector {
    public static void main(String[] args) {
        Vector v =  new Vector(5);
        StringBuilder sb = new StringBuilder("ABC");
        v.add(sb);
        System.out.println(v);//[ABC]
        sb.append("DEF");
        System.out.println(v);//[ABCDEF]
    }
}
