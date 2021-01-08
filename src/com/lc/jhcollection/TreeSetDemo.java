package com.lc.jhcollection;

import java.util.TreeSet;

/**
 * @ClassName TreeSet
 * @Author lj
 * @Date 2020/12/18 18:08
 * @Version V1.0
 **/
public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(45);
        ts.add(98);
        ts.add(11);
        //11 45 98 自带排序功能，按照元素自然顺序升序
        for (int i = 0; i < ts.size(); i++) {
            System.out.print(ts.subSet(0,ts)+" ");
        }
        System.out.println(ts);
    }
}
