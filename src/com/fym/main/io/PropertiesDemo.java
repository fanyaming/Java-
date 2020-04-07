package com.fym.main.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by lenovo on 2020/4/6.
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        loadProperties1();
       // readProperty2();
       // readProperty3();
    }
    //方式一:基于InputStream读取配置文件：
    private static void loadProperties1() throws IOException {
        Properties properties = new Properties();
       // FileInputStream stream = new FileInputStream("db.properties");
        InputStream stream = PropertiesDemo.class.getClassLoader().getResourceAsStream("db.properties");
        properties.load(stream);
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
    }

    //方法二通过Spring中的PropertiesLoaderUtils工具类进行获取：
   /* private static void readProperty2() {
        Properties properties = new Properties();
        try {
            properties = PropertiesLoaderUtils.loadAllProperties("db.properties");
            System.out.println(new String(properties.getProperty("warshipType.2").getBytes("iso-8859-1"), "gbk"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    //方法三通过 java.util.ResourceBundle 类读取：
    private static void readProperty3() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
        //遍历取值
        Enumeration enumeration = resourceBundle.getKeys();
        while (enumeration.hasMoreElements()) {
            try {
                String value = resourceBundle.getString((String) enumeration.nextElement());
                System.out.println(new String(value.getBytes("iso-8859-1"), "gbk"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }
}