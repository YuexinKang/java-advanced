package com.soft1841.thread;

/**
 * 多线程售票程序1
 * 通过继承Thread的方式实现
 */

public class TicketThreadTest1 extends Thread{
    public static void main(String[] args) {
        TicketThreadTest1 tt1=new TicketThreadTest1();
        tt1.start();
        TicketThreadTest1 tt2=new TicketThreadTest1();
        tt2.start();
        TicketThreadTest1 tt3=new TicketThreadTest1();
        tt3.start();
    }
}
class TicketThrea1 extends Thread{
    private int tickets=10;
    @Override
    public void run() {
        while (tickets<0){
            System.out.println(Thread.currentThread().getName()+"售票 当前票数"+--tickets);
        }
    }
}