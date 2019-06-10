package com.design.pattern.creational.singleton;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.singleton
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/6/10 14:06
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class HungrySingleton {
    //类加载的时候就初始化了.
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
