package com.design.pattern.creational.factorymethod;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.simplefactory
 * @Description: javaVedio
 * @Author: fanxx
 * @CreateDate: 2019/5/20 15:55
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java课程视频");
    }
}
