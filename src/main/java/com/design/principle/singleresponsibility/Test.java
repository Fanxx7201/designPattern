package com.design.principle.singleresponsibility;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.singleresponsibility
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/30 13:48
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    public static void main(String[] args) {
        /*Bird bird = new Bird();
        bird.mainMoveMode("大雁");*/
        //对飞的鸟和走的鸟进行区分
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("燕子");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
