package com.design.pattern.creational.simplefactory;

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
        //父类声明的引用, 指向子类的实现.
        /*Video video = new JavaVideo();
        video.produce();*/
        /*VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video == null){
            return;
        }
        video.produce();*/
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }
}
