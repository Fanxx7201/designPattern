package com.design.pattern.creational.singleton;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.singleton
 * @Description: 懒汉模式: 初始化的时候没有创建
 * 线程不安全的.一旦多线程使用是会出问题的.
 * @Author: fanxx
 * @CreateDate: 2019/6/6 16:34
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class LazySingleton {
    //不让外界直接new对象, 需要私有化构造方法
    private LazySingleton(){

    }

    //声明静态的对象,初始化的时候没有创建. 而是做延迟加载.
    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
