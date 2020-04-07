package com.fym.list;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * Created by lenovo on 2020/4/1.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);//[A, B, C]
        System.out.println(stack.peek());//C
        stack.pop();
        System.out.println(stack);//[A, B]
        System.out.println(stack.peek());//B

        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("C");
        System.out.println(arrayDeque);//[C, B, A]
        System.out.println(arrayDeque.peek());//C
        arrayDeque.pop();
        System.out.println(arrayDeque);//[B, A]
        System.out.println(arrayDeque.peek());//B
    }
}
