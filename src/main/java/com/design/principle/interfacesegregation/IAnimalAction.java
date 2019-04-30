package com.design.principle.interfacesegregation;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.interfacesegregation
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/30 15:03
 * <p>Copyright: Copyright (c) 2019</p>
 */
public interface IAnimalAction {
    /**
     * @Description  这个接口, 声明的实现过多了. 当Bird或者是Dog实现这个接口的时候, 总要有一些是空的实现. 比如狗不会飞.
     * @Date  2019/4/30
     * @Param []
     * @return void
     **/
    void eat();
    void fly();
    void swim();
}
