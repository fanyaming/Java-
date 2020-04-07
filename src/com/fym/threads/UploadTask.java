package com.fym.threads;

import java.io.*;
import java.net.Socket;

/**
 * Created by lenovo on 2020/3/30.
 */

public class UploadTask implements Runnable {
    //规定上传文件的最大大小
    private static final int SIZE = 1024*1024*2;
    private Socket socket;

    public UploadTask(Socket socket) {
        this.socket=socket;
    }
    @Override
    public void run() {
        int count=0;
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println(ip+".........connected");
        try {
            //读取客户端发来的数据
            InputStream inputStream = socket.getInputStream();

            //将读取到的文件存储到一个文件中
            File dir =new File("E:\\image");
            if (!dir.exists()){
                dir.mkdirs();
            }
            File file =new File(dir,ip+".jpg");
            //如果文件已经存在服务端,就文件名IP在原来的基础上+1
            while (file.exists()){
                file = new File(dir,ip+"("+(++count)+").jpg");
            }
            FileOutputStream fos =new FileOutputStream(file);

            byte[] buf=new byte[1024];

            int len=0;
            while ((len=inputStream.read(buf))!=-1){

                fos.write(buf,0,len);
                if (file.length()>SIZE){
                    System.out.println(ip+"文件体积过大");
                    fos.close();
                    socket.close();

                    System.out.println(ip+"....."+file.delete());
                    return;
                }
            }
            //获取socket输出流，将上传成功字样发给服务端
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("上传成功".getBytes());
            fos.close();
            socket.close();
        }catch (IOException e){
        }
    }
}
