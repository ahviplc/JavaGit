package com.lc.key;

/**
 * @ClassName StaticDemo
 * @Author lj
 * @Date 2020/12/17 17:16
 * @Version V1.0
 **/
public class StaticDemo2 {

    //static属性全部对象共享
    //static声明方法，也称为类方法

    public static String city = "中国";
    private String name;

    public StaticDemo2(String name) {
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
