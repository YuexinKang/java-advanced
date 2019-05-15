package com.soft1841.set;
/**
 * set的基础练习
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
        Set<String> set =  new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");
        System.out.println(set);
        String s1 = new String("A");
        String s2 = new String("B");
        String s3 = new String("C");
        String s4 = new String("A");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        Object[] array = set.toArray();
       for (int i = 0,len=array.length;i<len;i++){
           System.out.println(array[i]+"   ");

       }
        Iterator<String> iterator =set.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
       set.forEach(s -> System.out.println(s));
    }
}
