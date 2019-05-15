package com.java.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("java");
        int length = list.size();
        Random random = new Random();
        int index = random.nextInt(length);
        System.out.println(list.get(index));

    }
}
