package com.lc.jhcollection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassName TreeSetTest
 * @Author lj
 * @Date 2020/12/25 10:14
 * @Version V1.0
 **/
public class TreeSetTest {


    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(3);
        set.add(6);
        set.add(9);
        set.add(7);
        set.add(18);
        set.add(25);

        Iterator itor = set.iterator();
        while (itor.hasNext()) {
            System.out.print(itor.next()+" ");
        }
    }
}
