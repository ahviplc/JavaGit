package com.lc.jhcollection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName PropertiesDemo
 * @Author lj
 * @Date 2020/12/25 9:32
 * @Version V1.0
 **/
public class PropertiesDemo {

    //store和load方法
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("D:\\alixdocs\\alixfile\\20201023\\NIOABL191100004\\SYSTEMPLATE\\SYSTMP_NT1017_001\\114044721\\hello.java"));
            properties.setProperty("count",new Integer(0).toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        String count = properties.getProperty("count");
        int c =  Integer.parseInt(count)+1;
        System.out.println("这是第"+c+"次 use");
        properties.put("count",new Integer(c).toString());
        try {
            //创建文件并输出
            properties.store(new FileOutputStream("D:\\alixdocs\\alixfile\\20201023\\NIOABL191100004\\SYSTEMPLATE\\SYSTMP_NT1017_001\\114044721\\hello.java"),"第一次使用store/load");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}
