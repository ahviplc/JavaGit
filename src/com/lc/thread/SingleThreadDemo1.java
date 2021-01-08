package com.lc.thread;

/**
 * @ClassName SingleThreadDemo1
 * @Author lj
 * @Date 2020/12/28 10:37
 * @Version V1.0
 **/
public class SingleThreadDemo1 {

    public static void main(String[] args) {
        //单线程，按照顺序运行，线程运行完毕，才会走到main线程运行
        //要想实现交替运行，就用到多线程
        //如何实现多线程？
        new TestThread().run();
        //循环输出
        for (int i = 0; i < 10; i++) {
            System.out.println("main run");
        }
    }
}

class TestThread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("TestThread run");
        }
    }
}
