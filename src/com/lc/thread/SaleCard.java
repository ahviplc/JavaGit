package com.lc.thread;

/**
 * @ClassName SaleCard
 * @Author lj
 * @Date 2020/12/28 11:02
 * @Version V1.0
 **/
//四个出售点卖车票20张
public class SaleCard {

    public static void main(String[] args) {
        SaleTickets tickets = new SaleTickets();
        //启动了4个线程，实现资源共享
        //四个线程对象操作同一个资源
        new Thread(tickets).start();
        new Thread(tickets).start();
        new Thread(tickets).start();
        new Thread(tickets).start();

        
    }





}

class SaleTickets implements Runnable{
    private int tckets = 20;

    @Override
    public void run() {
        while (tckets>0){
            System.out.println(Thread.currentThread().getName()+"售出第"+tckets--+"张票");

        }
        //for (int i = 0; i < 20; i++) {
        //    System.out.println(Thread.currentThread().getName()+"售出第"+i+"张票");
        //}
    }
}
