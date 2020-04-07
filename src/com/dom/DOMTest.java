package com.dom;

import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by lenovo on 2020/4/7.
 */
public class DOMTest {
    @Test
    public void test1() throws  Exception{
        /*1):表示出需要被操作的XML文件的路径,注意是文件的路径,不是文件所在的目录.
                File f = new File(...);
        2):根据DocumentBuilderFactory类,来获取DocumentBuilderFactory对象.
                注意:工厂设计模式往往体现着单例设计模式.
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance() ;
        3):根据DocumentBuilderFactory对象,构建DocumentBuilder对象.
                注意:XxxFactory,就是用来创建Xxx对象的.
                DocumentBuilder build = factory .newDocumentBuilder();
        4):根据DocumentBuidler对象,构建Document对象.
                Document doc = build.parse(f);*/
        File file = new File("F:\\works\\xx.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);
        System.out.println(document);
    }
}
