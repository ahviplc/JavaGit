package com.lc.thread;

/**
 * @ClassName SetNameThread
 * @Author lj
 * @Date 2020/12/28 11:29
 * @Version V1.0
 **/
public class SetNameThread2 {
    public static void main(String[] args) {
        SetName setName = new SetName();
        //设置线程名，若不设置提供默认名称，格式为Thread-i  其中i>=0
        setName.setName("test Thread");
        setName.start();
        for (int i = 0; i < 10; i++) {
            setName.printMsg();
        }
    }

}

class SetName2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            printMsg();
        }
    }

    public void printMsg() {
        //输出线程名，获取不是的当前线程了
        //Thread t = new Thread();
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name="+name);
    }
}
