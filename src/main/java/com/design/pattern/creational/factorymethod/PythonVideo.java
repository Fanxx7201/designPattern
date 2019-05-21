package com.design.pattern.creational.factorymethod;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.simplefactory
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/20 16:13
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
