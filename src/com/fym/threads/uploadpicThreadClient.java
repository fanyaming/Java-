package com.fym.threads;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by lenovo on 2020/3/30.
 */
public class uploadpicThreadClient {
    public static void main(String[] args) throws IOException {
        //1、创建客户端socket
        Socket socket = new Socket("127.0.0.1", 8080);

        //2、读取客户端要上传的图片
        FileInputStream fis = new FileInputStream("E:\\5.JPG");

        //3、获取socket输出流，将读到的图片数据发给服务端
        OutputStream outputStream = socket.getOutputStream();
        byte[] buf = new byte[1024];

        int len = 0;
        //使用输出流写出图片数据
        while ((len = fis.read(buf)) != -1) {
            outputStream.write(buf, 0, len);
        }

        // 告诉服务端，客户端数据已发送完毕，服务端停止读取
        socket.shutdownOutput();

        //读取服务端返回的数据
        InputStream inputStream = socket.getInputStream();
        //缓冲区存放数据提高读写速度
        byte[] bufIn = new byte[1024];

        int lenIn = inputStream.read(buf);
        String text = new String(buf, 0, lenIn);
        System.out.println(text);

        //关闭资源
        fis.close();
        socket.close();
    }
}
