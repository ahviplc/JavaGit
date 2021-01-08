package com.lc.jhcollection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassName TreeSet
 * @Author lj
 * @Date 2020/12/18 18:08
 * @Version V1.0
 **/
public class ComparatorDemo implements Comparator {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("b");
        ts.add("a");
        ts.add("c");
        ts.add("A");

        Iterator iterator = ts.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next + " ");
        }

    }

    @Override
    public int compare(Object o1, Object o2) {
        //倒序  返回值有-1、0、1，分别表示比较的结果，默认是升序排列
        //use comparaTo
        String s1, s2;
        s1 = (String) o1;
        s2 = (String) o2;
        return s2.compareTo(s1);

        //int i = s1.compareTo(s2);
        //if (i==0){
        //   return s1.compareTo(s2);
        //}else {
        //    return i;
        //}

    }
}
