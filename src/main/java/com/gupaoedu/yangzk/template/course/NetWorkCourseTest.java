package com.gupaoedu.yangzk.template.course;

public class NetWorkCourseTest {
    public static void main(String[] args) {
        System.out.println("---Java架构师课程---");
        NetworkCourse javaCourse = new JavaCourse(true);
        javaCourse.createCourse();
        System.out.println("---AI课程---");
        NetworkCourse aiCourse = new AiCourse();
        aiCourse.createCourse();

    }
}
