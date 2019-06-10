package com.design.pattern.creational.singleton;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.singleton
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/6/10 9:36
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton(){

    }


    //volatile 保证线程看到共享内存, 保证内存的可见性. 防止指令重排序.
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;


    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    //new 对象的过程
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton指向刚分配的内存地址.
                    //指定重排序可以提高程序效率. 这里2,3的位置是可以互相调换的. 因为这种重排序不会改变单线程运行的结果.
                    //2,3进行重排序了, 那么其他的线程如果访问这个对象, 就有可能访问到还没有初始化的对象. 会抛异常.解决办法是不允许线程1看到重排序.
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
