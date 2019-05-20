package com.design.principle.compositionaggregation;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.compositionaggregation
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/20 14:05
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class ProductDao{
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
