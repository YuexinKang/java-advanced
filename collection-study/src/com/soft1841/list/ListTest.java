package com.soft1841.list;
/**
 * list的基础练习
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        //通过for循环遍历集合
        for (int i = 0,len=list.size();i<len;i++){
            System.out.println(list.get(1));
        }
        //用Iterator迭代器遍历集合
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //用lambda表达式遍历集合
        list.forEach(s -> System.out.println(s));
    }
}
