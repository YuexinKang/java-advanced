package com.soft1841.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        map.put("江苏","南京");
        map.put("浙江","杭州");
        map.put("安徽","合肥");
        Iterator<Map.Entry<String,String>> iterator =map.entrySet().iterator();
        while (iterator.hasNext()){
           Map.Entry<String,String> entry =iterator.next();
           System.out.println(entry.getKey()+"省会是"+entry.getValue());
        }


    }
}
