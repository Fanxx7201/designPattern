package com.design.principle.singleresponsibility;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.singleresponsibility
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/30 13:47
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Bird {
    /**
     * @Description  当拓展了鸵鸟这个鸟之后, 我们的方法就出现问题, 当拓展这个方法的时候, 出现bug的概率很高.所以, 我们新写两个类: FlyBird, WalkBird
     * @Date  2019/4/30
     * @Param [birdName]
     * @return void
     **/
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName + "用脚走");
        }
        System.out.println(birdName + "用翅膀飞");
    }
}
