package com.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.singleton
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/6/27 16:38
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        //设置权限, 为true的时候, HungrySingleton的构造器private就会放开 -- 我们在HungrySingleton中需要写反射防御的代码
        constructor.setAccessible(true);
        // 单例拿出来一个对象
        HungrySingleton instance = HungrySingleton.getInstance();

        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);


    }
}
