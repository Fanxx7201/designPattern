package com.design.pattern.creational.factorymethod;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.simplefactory
 * @Description: VideoFactory是一种契约, 并不规定产生哪一种类的视频.产生哪一种类视频, 完全是子类实现.
 * @Author: fanxx
 * @CreateDate: 2019/5/20 16:17
 * <p>Copyright: Copyright (c) 2019</p>
 */
public abstract class VideoFactory {

    //用抽象类, 是因为有些行为可能是已知的.
    public abstract Video getVideo();
    /*public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
            return null;
    }*/

    /**
     * @Description  反射, 保证拓展性. 如果新加了课程, 传类进来就行, 不用修改工厂类的代码.
     * @Date  2019/5/21
     * @Param [c]
     * @return com.design.pattern.creational.simplefactory.Video
     **/
    /*public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }*/



}
