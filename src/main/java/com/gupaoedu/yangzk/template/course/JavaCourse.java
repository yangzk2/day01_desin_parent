package com.gupaoedu.yangzk.template.course;

/**
 * java课程
 */
public class JavaCourse extends NetworkCourse {
    //是否检查作业
    private boolean needHomeWork = false;

    public JavaCourse(boolean needHomeWork) {
        this.needHomeWork = needHomeWork;
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeWork;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查Java作业");
    }

    @Override
    protected void releaseSchoolGive() {
        System.out.println("发布java架构师课程上课通知");
    }
}
