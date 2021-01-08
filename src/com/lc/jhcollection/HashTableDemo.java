package com.lc.jhcollection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName HashTableDemo
 * @Author lj
 * @Date 2020/12/24 17:53
 * @Version V1.0
 **/
public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("one",new Integer(1));
        hashtable.put("two",new Integer(2));
        hashtable.put("three",new Integer(3));

        Integer two = hashtable.get("two");
        if (null!=two){
            System.out.println("two="+two);
        }


        //hashTable的子类
        Properties pros = new Properties();
        pros.setProperty("China","beijing");
        pros.setProperty("Japan","dongjing");
        pros.setProperty("France","paris");

        Set<Object> sets = pros.keySet();
        Iterator<Object> iterator = sets.iterator();
        while (iterator.hasNext()) {
            String nation = (String) iterator.next();
            System.out.println("国家是"+nation);
            System.out.println("首都是"+pros.getProperty(nation));
        }
    }
}
