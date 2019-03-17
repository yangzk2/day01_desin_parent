package com.gupaoedu.yangzk.template.course;

/**
 * AI课程
 */
public class AiCourse extends NetworkCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查AI课程作业");
    }

    @Override
    protected void releaseSchoolGive() {
        System.out.println("发布Ai课程上课通知");

    }
}
