package com.design.principle.openclose;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.openclose
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/29 11:03
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    //重写父类的方法, 并进行打折
    @Override
    public Double getPrice() {
        //这里可以具体做一些判断, 比如什么样的情况8折之类的.
        return super.getPrice() * 0.8;
    }
    //新加一个获取原始价格的方法
    public Double getOriginPrice(){
        return super.getPrice();
    }
}
