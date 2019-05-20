package com.design.principle.compositionaggregation;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.compositionaggregation
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/20 14:03
 * <p>Copyright: Copyright (c) 2019</p>
 */
public abstract class DBConnection {
   /* public String getConnection(){
        return "MYSQL数据库连接";
    }*/
   public abstract String getConnection();
}
