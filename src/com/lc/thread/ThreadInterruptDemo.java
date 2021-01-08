package com.lc.thread;

/**
 * @ClassName ThreadSleepDemo
 * @Author lj
 * @Date 2021/1/8 11:48
 * @Version V1.0
 **/
//线程休眠  sleep方法  loop
public class ThreadInterruptDemo{

//一个线程正在运行，另一个线程可以调用那个线程对象的interrupt方法中断
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("当前线程为"+t.getName());
        System.out.println("A:t.isInterrupted()="+t.isInterrupted());

        t.interrupt();
        System.out.println("B:t.isInterrupted()="+t.isInterrupted());
        System.out.println("C:t.isInterrupted()="+t.isInterrupted());
        try {
            Thread.sleep(2000);
            System.out.println("线程没有被中断");
        } catch (InterruptedException e) {
            System.out.println("线程被中断");

        }
        //sleep抛出错误。清除了中断标志
        System.out.println("D:t.isInterrupted()="+t.isInterrupted());


    }
}
