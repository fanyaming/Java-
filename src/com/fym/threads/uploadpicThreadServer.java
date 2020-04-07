package com.fym.threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lenovo on 2020/3/30.
 */
public class uploadpicThreadServer {
    public static void main(String[] args) throws IOException {
        //创建TCP的socket服务端
        ServerSocket ss =new ServerSocket(8080);
        while (true){
            //获取客户端
            //阻塞式方法，有任务时就开启，否则一直处于等待状态
            Socket socket = ss.accept();
            new Thread(new UploadTask(socket)).start();
        }
    }
}
