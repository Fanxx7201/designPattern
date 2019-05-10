package com.design.principle.liskovSubstitution;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.liskovSubstitution
 * @Description:长方形有长和宽
 * @Author: fanxx
 * @CreateDate: 2019/5/5 15:19
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Rectangle implements Quadrangle{
    private long length;
    private long width;


    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
