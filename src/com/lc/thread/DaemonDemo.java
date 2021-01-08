package com.lc.thread;

/**
 * @ClassName DaemonDemo
 * @Author lj
 * @Date 2020/12/28 11:53
 * @Version V1.0
 **/
//如果一个进程中只有后台线程在运行，这个进程就会结束。
public class DaemonDemo {

    public static void main(String[] args) {
        SetDaemon daemon = new SetDaemon();
        Thread tt = new Thread(daemon);
        //设置为后进程
        tt.setDaemon(true);
        tt.start();

    }

}
class SetDaemon implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run"+i);
        }
    }
}
