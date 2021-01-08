package com.lc.key;

import java.security.PublicKey;

/**
 * @ClassName ThisDemo1
 * @Author lj
 * @Date 2020/12/17 16:57
 * @Version V1.0
 **/
public class ThisDemo1 {

    private String name;
    private int age;

    //不清不楚，到底是形参赋给类属性还是反之
    //public ThisDemo1(String name,int age){
    //    name = name;
    //    age = age;
    //
    //}

    //this使用范例1
    public ThisDemo1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ThisDemo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ThisDemo1 xioahua = new ThisDemo1("xioahua", 24);
        System.out.println(xioahua);
    }
}
