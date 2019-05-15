package com.soft1841.thread;
/**
 * Timer定时器
 * 由TimerTask和Timer两部分组成先写TimerTask,再写Timer
 */

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        //TimerTask不是普通的类，而是一个借口，要实现它的所有方法
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
           System.out.println(new Date());
            }
        };
        TimerTask task1=new TimerTask() {
            @Override
            public void run() {
            System.out.println("hello");
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,0,1000);
        timer.schedule(task1,0,500);
    }
}
