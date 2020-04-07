package com.fym;

/**
 * Created by lenovo on 2020/4/6.
 */
public class ClassMock {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.若已知具体的类，通过类的class属性获取，该方法最为安全可靠，程序性能最高
        Class<String> clz = String.class;
        System.out.println(clz);//class java.lang.String
        //2.已知某个类的实例，调用该实例的getClass()方法获取Class对象；
        Person person = new Person();
        Class<? extends Person> clz1 = person.getClass();
        System.out.println(clz1);//class com.fym.Person
        //3.已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName()获取，可能抛ClassNotFoundException;
        Class<?> clz2 = Class.forName("java.lang.String");
        System.out.println(clz2);//class java.lang.String
        //4.通过类加载器来获取；
        ClassLoader classLoader = ClassMock.class.getClassLoader();
        Class<?> clz3 = classLoader.loadClass("java.lang.String");
        System.out.println(clz3);//class java.lang.String
    }
}
