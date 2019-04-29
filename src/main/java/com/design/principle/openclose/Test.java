package com.design.principle.openclose;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.openclose
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/28 16:51
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    public static void main(String[] args) {
        //通过接口指定实体类
        ICourse javaCourse = new JavaCourse(96, "课程", 348d);
        System.out.println("课程id:" + javaCourse.getId());
        System.out.println("课程价格: " + javaCourse.getPrice());

        //计算打折之后的价格
        ICourse javaCourse2 = new JavaDiscountCourse(96, "课程", 348d);
        //获取原价时为什么需要强转? 因为是用父类声明的引用, 拿不到public方法.
        //((JavaDiscountCourse) javaCourse2).getOriginPrice()
        System.out.println("课程id为:" + javaCourse2.getId() + "的课程, 打折之后价格为: " + javaCourse2.getPrice() + "课程原价为: " + ((JavaDiscountCourse) javaCourse2).getOriginPrice());
    }
}
