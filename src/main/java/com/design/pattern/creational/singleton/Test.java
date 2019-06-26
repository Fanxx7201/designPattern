package com.design.pattern.creational.singleton;

import java.io.*;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.singleton
 * @Description: 序列化破坏单例模式原理解析及解析方案
 * @Author: fanxx
 * @CreateDate: 2019/6/26 14:44
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton-file"));
        oos.writeObject(instance); //可能会抛异常NotSerializableException, 原因是HungrySingleton类没有实现Serializable接口

        File file = new File("singleton-file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton-file"));
        //看readObject方法的源码
        HungrySingleton newInstance = (HungrySingleton)ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
        //HungrySingleton添加方法, 解决序列化问题
    }
}
