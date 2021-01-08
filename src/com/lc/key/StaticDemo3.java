package com.lc.key;

/**
 * @ClassName StaticDemo
 * @Author lj
 * @Date 2020/12/17 17:16
 * @Version V1.0
 **/
public class StaticDemo3 {

    //static属性全部对象共享
    //static声明代码部分，静态代码块，只执行一次，并且优先于静态方法

    static {
        System.out.println("我最先执行，我可以做一些类属性初始化操作");

    }

    public static String city = "中国";
    private String name;

    public StaticDemo3(String name) {
        this.name = name;
    }

    public static void setCity(String c){
        city = c;
    }

    @Override
    public String toString() {
        return name ;
    }
}
