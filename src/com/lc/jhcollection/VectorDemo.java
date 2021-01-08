package com.lc.jhcollection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @ClassName VectorDemo
 * @Author lj
 * @Date 2020/12/24 15:27
 * @Version V1.0
 **/
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("hello");
        vector.add("hlo");
        vector.add("hel");

        Enumeration<String> elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement()+" ");
        }

        //第二种迭代
        System.out.println();
        System.out.println("----------------**----------------");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

    }
}
