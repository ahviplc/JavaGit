package com.lc.file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileDemo
 * @Author lj
 * @Date 2020/12/29 15:00
 * @Version V1.0
 **/
public class FileDemo {

    public static void main(String[] args) {
        File file = new File("d:\\111.txt");
        if (file.exists()){
            file.delete();
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        System.out.println("文件名"+file.getName());
        System.out.println("文件路径"+file.getPath());
        System.out.println("文件绝对路径"+file.getAbsolutePath());
        System.out.println("父文件夹名"+file.getParent());
        System.out.println(file.exists()?"文件存在":"文件不存在");
        System.out.println(file.canWrite()?"可写":"文件不可写");
        System.out.println(file.canRead()?"可读":"文件不可读");
        System.out.println(file.isDirectory()?"是":"不是"+"目录");
        System.out.println(file.isFile()?"是":"不是"+"文件");
        System.out.println(file.isAbsolute()?"是":"不是"+"绝对路径");
        System.out.println("文件最后修改时间"+file.lastModified());
        System.out.println("文件大小"+file.length()+"Bytes");

    }
}
