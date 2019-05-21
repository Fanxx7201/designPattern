package com.design.pattern.creational.factorymethod;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.simplefactory
 * @Description: Test就是应用层/客户端代码
 * @Author: fanxx
 * @CreateDate: 2019/5/20 16:14
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce(); //生产视频
    }
}
