package com.fym.process;

import java.io.IOException;

/**
 * Created by lenovo on 2020/3/30.
 */
//运行一个进程
public class ProcessDemo {
    public static void main(String[] args) throws IOException {
        //方式1:Runtime类的exec方法:
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("notepad");//打开一个记事本
        //方式2:ProcessBuilder的start方法:
        ProcessBuilder processBuilder = new ProcessBuilder("notepad");//打开一个记事本
        processBuilder.start();
    }
}
