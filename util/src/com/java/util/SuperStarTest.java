package com.java.util;

import java.util.ArrayList;
import java.util.List;

public class SuperStarTest {
    public static void main(String[] args) {
        List<SuperStar> list = new ArrayList<>();
        list.add(new SuperStar("乔丹","飞人/神",30.1,6.2,5.3));
        list.add(new SuperStar("拉塞尔","指环王",15.1,22.5,4.3));
        list.add(new SuperStar("贾巴尔","天钩",24.6,11.2,3.6));
        System.out.println("------------NBA历史十大巨星------------");
        System.out.println("姓名    绰号    得分    篮板    价格");
        for (int i = 0,len = list.size();i<len;i++){
            System.out.println(list.get(i).getName()+"   "
                    +list.get(i).getEpithet()+"   "
                    +list.get(i).getPoint()+"   "
                    +list.get(i).getBackboard()+"   "
                    +list.get(i).getAssisting()
            );
            System.out.println();
        }
    }
}
