package com.lc.jhcollection;

import java.util.*;

/**
 * @ClassName IterDemo
 * @Author lj
 * @Date 2020/12/23 16:21
 * @Version V1.0
 **/
public class IterDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("hello","hello_value");
        map.put("hell","hell_value");
        map.put("hel","hel_value");
        //ite遍历map
        Set<String> sets = map.keySet();
        for (String set : sets){
            System.out.println("key="+set+" value="+map.get(set));
        }
        //two
        System.out.println("two-------------------------------------");
        Set<Map.Entry<String, String>> entrySets = map.entrySet();
        for (Map.Entry<String, String> entrySet : entrySets) {
            System.out.println("key="+entrySet.getKey()+" value="+entrySet.getValue());
        }
        //three  iterator()
        List<String> lists = new ArrayList<String>();
        lists.add("hello");
        lists.add("world");
        lists.add("java");
        lists.add("java");
        lists.add("world");
        Iterator<String> iterator = lists.iterator();
        //集合可以通过Iterator去遍历集合中的元素,前提是该集合直接或间接实现了Iterator接口
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        //Se也可
        //ListIterator
       // ListIterator<String> listIter = lists.listIterator();
       // while (listIter.hasNext()){
       //     String ele = listIter.next();
       //     listIter.set(ele+"+");
       // }
       // System.out.println("修改后的内容");
       // listIter = lists.listIterator();
       //while (listIter.hasNext()){
       //    System.out.print(listIter.next()+" ");
       //}
       // System.out.println();
       // System.out.println("逆向输出");
       //while (listIter.hasPrevious()){
       //    System.out.print(listIter.previous()+" ");
       //}

        //System.out.println("list有序？yes");
        //System.out.println(lists.toString());
        //
        //System.out.println("set无序？yes  不重复？yes");
        //Set<String> strs = new HashSet<String>();
        //
        //strs.add("hello");
        //strs.add("java");
        //strs.add("hello");
        //strs.add("world");
        //Iterator<String> ite = strs.iterator();
        //while (ite.hasNext()){
        //    System.out.print(ite.next()+" ");
        //}

        //hashMap无序的
        HashMap<String, Object> map1 = new HashMap<>();
        HashMap<String, Object> map2 = new HashMap<>();
        //第一种插入
        for (int i = 0; i < 10; i++) {
            map1.put(String.valueOf(i),i);
        }
        //第二种插入
        for (int i = 9; i >= 0; i--) {
            map2.put(String.valueOf(i),i);
        }
        Iterator<Map.Entry<String, Object>> iterator1 = map1.entrySet().iterator();
        //结果输出一致，所以HashMap无序
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
            System.out.println("-----------------------");
        }
    }
}
