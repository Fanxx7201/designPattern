package com.design.principle.liskovSubstitution;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.liskovSubstitution
 * @Description: 正方形只有边长
 * @Author: fanxx
 * @CreateDate: 2019/5/5 15:22
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Square extends Rectangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return getSideLength();
    }

    @Override
    public void setLength(long length) {
        setSideLength(length);
    }

    @Override
    public long getWidth() {
        return getSideLength();
    }

    @Override
    public void setWidth(long width) {
        setSideLength(width);
    }
}
