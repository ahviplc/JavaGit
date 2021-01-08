package com.lc.jhcollection;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @ClassName ThreeMapDemo
 * @Author lj
 * @Date 2020/12/24 10:48
 * @Version V1.0
 **/
public class ThreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(new Integer(10000-2000),"周三");
        treeMap.put(new Integer(10000-3000),"李四");
        treeMap.put(new Integer(10000-4000),"王五");
        treeMap.put(new Integer(10000-5000),"张柳");
        //获取值，默认升序排序
        Iterator<String> iterator = treeMap.values().iterator();
        while (iterator.hasNext()){
            //工资由低到高
            System.out.println(iterator.next());
        }
        //为null,说明使用的是自然顺序
        System.out.println(treeMap.comparator());

        String t = "mdks";
        t.compareTo("mdks");


    }
}
