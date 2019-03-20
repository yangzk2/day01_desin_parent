package com.gupaoedu.yangzk.observer.gperadvice;

/**
 * 观察者模式测试
 */
public class GperObserverTest {
    public static void main(String[] args) {
        //首先先要有社区
        GPer gPer = GPer.getInstance();
        //老师
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        //提问者
        Question question = new Question();
        question.setUserName("yangzk");//提问者
        question.setContent("如何理解观察者模式,如何区分那些场景适用观察者模式!");
        gPer.addObserver(tom);
        gPer.publishQuestion(question);
    }
}
