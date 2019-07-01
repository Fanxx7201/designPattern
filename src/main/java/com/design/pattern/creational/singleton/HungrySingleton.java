package com.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.singleton
 * @Description: 饿汉式
 * @Author: fanxx
 * @CreateDate: 2019/6/10 14:06
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class HungrySingleton implements Serializable {
    //类加载的时候就初始化了. final:类不可以再改变
    //声明为final的变量, 必须在类加载完成时就已经赋值
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        //对于类加载的时候, 实例就已经创建好了这样的类时有效的.
        if(hungrySingleton != null){
            System.out.println("单例构造器禁止反射");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //序列化破坏单例模式的解决方案: 源码中使用了hasReadResolveMethod方法
    //反射实现的.没有什么继承关系, 只需要方法名称就可以了.
    private Object readResolve(){
        return hungrySingleton;
    }

    //源码中的方法, 注意看注释
    /**
     * Returns true if represented class is serializable or externalizable and
     * defines a conformant readResolve method.  Otherwise, returns false.
     */
    /*boolean hasReadResolveMethod() {
        requireInitialized();
        return (readResolveMethod != null);
    }*/
}
