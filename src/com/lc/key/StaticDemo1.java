package com.lc.key;

/**
 * @ClassName StaticDemo
 * @Author lj
 * @Date 2020/12/17 17:16
 * @Version V1.0
 **/
public class StaticDemo1 {

    //static属性全部对象共享
    //static声明变量

    public static String city = "中国";
    private String name;

    public StaticDemo1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
