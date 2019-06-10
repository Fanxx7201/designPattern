package com.design.pattern.creational.singleton;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.singleton
 * @Description: 基于类初始化的延迟加载解决方案.
 * @Author: fanxx
 * @CreateDate: 2019/6/10 10:29
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton;
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){

    }
}
