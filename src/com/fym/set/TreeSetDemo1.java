package com.fym.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by lenovo on 2020/4/4.
 */
class Person {
     String name;
     Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.fym.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(new NameComparator());
        set.add(new Person("陈伊伊",20));
        set.add(new Person("钱二",30));
        set.add(new Person("孙三三",10));
        set.add(new Person("李四四四",15));
        System.out.println(set);
        //[com.fym.Person{name='李四四四', age=15}, com.fym.Person{name='孙三三', age=10}, com.fym.Person{name='陈伊伊', age=20}, com.fym.Person{name='钱二', age=30}]
    }
}
class NameComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        //先按照名字字数的长短来比较
        if(o1.name.length()>o2.name.length()){
            return -1;
        }else if(o1.name.length()<o2.name.length()){
            return 1;
            //如果名字长短一样,再按照年龄来自然排序
        }else if(o1.age>o2.age){
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }
        return 0;
    }
}
