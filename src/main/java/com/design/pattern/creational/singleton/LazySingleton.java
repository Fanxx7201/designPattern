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

    /**
     * @Description  加同步锁可以保证线程安全.
     * 静态方法加锁, 锁的是这个class的静态文件.
     * 如果不是静态方法加锁, 锁的是堆内存中生成的对象.
     * @Date  2019/6/10
     * @Param []
     * @return com.design.pattern.creational.singleton.LazySingleton
     **/
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //以下这种方法, 相当于静态方法加锁
    //问题: 同步锁比较消耗资源. 锁的是class的话范围很大, 对性能有影响
    /*
    public static LazySingleton getInstance(){
        synchronized (LazySingleton.class){
            if(lazySingleton == null){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
    */
}
