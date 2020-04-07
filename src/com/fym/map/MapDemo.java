package com.fym.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by lenovo on 2020/4/4.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //添加元素
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value2");
        map.put("key4","value4");
        System.out.println(map);//{key1=value1, key2=value2, key3=value3, key4=value4}
       // com.fym.map.clear();//从此映射中移除所有映射关系（可选操作)
       // System.out.println(com.fym.map);//{}
        //com.fym.map.remove("key1");如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
       // System.out.println(com.fym.map);//{key2=value2, key3=value3, key4=value4}
        //迭代所有的key组成的集合(keySet())
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        //迭代所有的value集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        //获取map中所有的entry
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }

    }
}
