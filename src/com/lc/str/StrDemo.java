package com.lc.str;

/**
 * @ClassName StrDemo
 * @Author lj
 * @Date 2020/12/2 11:51
 * @Version V1.0
 **/
public class StrDemo {

    String s = "a,b,c";

    //堆内存表示基本类型的数据
    char c = 's';
    Character ch = new Character(c);
    //or
    Character ch2 = new Character('c');
    //基本类型自动转为包装类型
    Character ch3 = 'b';
    //包装类型转化为基本类型
    char ch4 = ch3;

    public static void main(String[] args) {
        StrDemo strDemo = new StrDemo();
        //String[] split = strDemo.s.split(",");
        ////String res = "";
        //String res = new String();
        //for (String s : split) {
        //    System.out.println(s);
        //    res+=s;
        //}
        //System.out.println(res);
        //strDemo.show();
    System.out.println(strDemo.c+"   "+ strDemo.ch+"    "+ strDemo.ch2+"    "+ strDemo.ch3+"   "+strDemo.ch4);
    }

    void show(){
        String s = new String("abc");
        System.out.println(s);
    }
}
