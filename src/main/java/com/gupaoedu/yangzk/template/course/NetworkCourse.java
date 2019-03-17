package com.gupaoedu.yangzk.template.course;

/**
 * 模板模式
 *      模板模式就是在一个类中有一个或者多个未实现的方法
 *      通过继承的方式供子类去实现 而这几个未实现的方法有固定的执行顺序
 */
public abstract class NetworkCourse {

    /**
     * 首先我先定义一个固定的创建课程的模板方法
     */
    protected final void createCourse(){

        //1.发布预习资料
        this.postPreResource();
        //2.制作上课ppt
        this.createPPT();
        //3.发布上课通知
        this.releaseSchoolGive();
        //4.直播视频上课
        this.liveVideo();
        //5. 提交课件、课堂笔记
        this.postNote();
        //6. 提交源码
        this.postResource();
      //7. 创建钩子方法   判断是否布置作业
        if(this.needHomeWork()){
            //8.检查作业
            this.checkHomework();
        }

   }
    //8.检查作业
    protected abstract void checkHomework();

    //7.钩子方法判断是否布置作业
    protected  boolean needHomeWork(){
        return false;
    }

    //6. 提交源码
    protected final void postResource(){
        System.out.println("提交课堂源码");
    }

    //5. 提交课件、课堂笔记
    protected final void postNote(){
        System.out.println("提交课件、课堂笔记");
    }

    //4.直播视频上课
    protected final void liveVideo(){
        System.out.println("开始直播上课");
    }

    //3.发布上课通知
    protected abstract void releaseSchoolGive();


    //2.制作上课ppt
   final void createPPT(){
       System.out.println("制作上课PPT");
   }

    //发布预习资料
    protected final void postPreResource(){
        System.out.println("发布预习资料");
    }
}
