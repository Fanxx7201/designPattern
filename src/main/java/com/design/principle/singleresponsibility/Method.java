package com.design.principle.singleresponsibility;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.singleresponsibility
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/30 14:29
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Method {
    //多职责的方法
    private void updateUserInfo(String userName, String address){
        userName = "Geely";
        address = "beijing";
    }
    private void updateUserInfo(String userName, String... properties){
        userName = "Geely";
    }

    //单一职责的方法, 将之前的一个方法拆分为两个.
    private void updateUsername(String userName){
        userName = "Geely";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }

    //另外一种写法, 就是加入一个布尔值, 这说明这个方法就是两个职责的, 所以最好还是拆开成上面的样子
    private void updateUserInfo(String userName, String address, Boolean bool){
        if(bool){
            //todo: something1
        }else{
            //todo: something2
        }
        userName = "Geely";
        address = "beijing";
    }
}
