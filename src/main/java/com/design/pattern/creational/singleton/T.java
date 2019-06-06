package com.design.pattern.creational.singleton;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.singleton
 * @Description: 多线程懒汉式测试类
 * @Author: fanxx
 * @CreateDate: 2019/6/6 16:48
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
        System.out.println("program end");
    }
}
