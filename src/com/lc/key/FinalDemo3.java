package com.lc.key;

/**
 * @ClassName FinalDemo1
 * @Author lj
 * @Date 2020/12/17 18:17
 * @Version V1.0
 **/
public class FinalDemo3 {
    //final关键字修饰类  方法   变量
    public static final int score = 100;


    public final void show(){
        System.out.println("我得到score"+score);
    }
    public void show2(){
        System.out.println("我得到score"+score);
    }

}
