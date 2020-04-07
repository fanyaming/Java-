package com.test;

import org.junit.Test;

/**
 * Created by lenovo on 2020/4/7.
 */
public class MathImplTest {
    private IMath m = new MathImpl();
    @Test
    public void add()  {
        int ret = m.add(2, 4);
        System.out.println(ret);
    }

}