package com.design.principle.openclose;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.openclose
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/28 16:23
 * <p>Copyright: Copyright (c) 2019</p>
 */
public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
    //获取课程的打折价格
    //如果这样实现打折的需求, 那所有实现这个接口的类, 都要新写一个方法. 代码改的太多了.
    //解决办法: 新建一个类: JavaDiscountCourse. 继承JavaCourse类.
    //Double getDiscountPrice();

}
